import java.util.ArrayList;
import java.io.*;
import java.sql.*;

public class VehicleManager {

    private ArrayList<Vehicle> vehicles;

    public VehicleManager() {

        vehicles = new ArrayList<>();

        loadVehiclesFromFile();
    }

    public void addVehicle(Vehicle vehicle) {

        vehicles.add(vehicle);

        saveVehiclesToFile();

        saveVehicleToDatabase(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {

        return vehicles;
    }

    public Vehicle searchVehicle(String registrationNumber) {

        for (Vehicle vehicle : vehicles) {

            if (vehicle.getRegistrationNumber()
                    .equalsIgnoreCase(registrationNumber)) {

                return vehicle;
            }
        }

        return null;
    }

    public boolean deleteVehicle(String registrationNumber) {

        Vehicle vehicle = searchVehicle(registrationNumber);

        if (vehicle != null) {

            vehicles.remove(vehicle);

            saveVehiclesToFile();
            
            deleteVehicleFromDatabase(
        registrationNumber);

            return true;
        }

        return false;
    }

    private void saveVehiclesToFile() {

        try {

            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter("vehicles.txt"));

            for (Vehicle vehicle : vehicles) {

                String line = "";

                if (vehicle instanceof Car) {

                    Car car = (Car) vehicle;

                    line = "Car,"
                            + car.getMake() + ","
                            + car.getModel() + ","
                            + car.getYear() + ","
                            + car.getRegistrationNumber() + ","
                            + car.getNumberOfDoors();

                } else if (vehicle instanceof Truck) {

                    Truck truck = (Truck) vehicle;

                    line = "Truck,"
                            + truck.getMake() + ","
                            + truck.getModel() + ","
                            + truck.getYear() + ","
                            + truck.getRegistrationNumber() + ","
                            + truck.getLoadCapacity();

                } else if (vehicle instanceof Motorcycle) {

                    Motorcycle motorcycle =
                            (Motorcycle) vehicle;

                    line = "Motorcycle,"
                            + motorcycle.getMake() + ","
                            + motorcycle.getModel() + ","
                            + motorcycle.getYear() + ","
                            + motorcycle.getRegistrationNumber() + ","
                            + motorcycle.isHasHelmet();
                }

                writer.write(line);

                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {

            System.out.println("Error Saving File");
        }
    }

    private void loadVehiclesFromFile() {

        try {

           File file = new File("vehicles.txt");

            if (!file.exists()) {

                return;
            }

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String type = data[0];
                String make = data[1];
                String model = data[2];
                int year = Integer.parseInt(data[3]);
                String reg = data[4];

                if (type.equals("Car")) {

                    int doors =
                            Integer.parseInt(data[5]);

                    vehicles.add(
                            new Car(make, model,
                                    year, reg, doors));

                } else if (type.equals("Truck")) {

                    double capacity =
                            Double.parseDouble(data[5]);

                    vehicles.add(
                            new Truck(make, model,
                                    year, reg, capacity));

                } else if (type.equals("Motorcycle")) {

                    boolean helmet =
                            Boolean.parseBoolean(data[5]);

                    vehicles.add(
                            new Motorcycle(make, model,
                                    year, reg, helmet));
                }
            }

            reader.close();

        } catch (Exception e) {

            System.out.println("Error Loading File");
        }
    }

    private void saveVehicleToDatabase(Vehicle vehicle) {

        try {

            Connection conn =
                    DatabaseManager.connect();

            if (conn == null) {

                return;
            }

            String sql =
                    "INSERT INTO vehicles "
                    + "(type, make, model, year, registration, extra) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement pst =
                    conn.prepareStatement(sql);

            pst.setString(1,
                    vehicle.getVehicleType());

            pst.setString(2,
                    vehicle.getMake());

            pst.setString(3,
                    vehicle.getModel());

            pst.setInt(4,
                    vehicle.getYear());

            pst.setString(5,
                    vehicle.getRegistrationNumber());

            String extra = "";

            if (vehicle instanceof Car) {

                extra = String.valueOf(
                        ((Car) vehicle)
                                .getNumberOfDoors());

            } else if (vehicle instanceof Truck) {

                extra = String.valueOf(
                        ((Truck) vehicle)
                                .getLoadCapacity());

            } else if (vehicle instanceof Motorcycle) {

                extra = String.valueOf(
                        ((Motorcycle) vehicle)
                                .isHasHelmet());
            }

            pst.setString(6, extra);

            pst.executeUpdate();

            conn.close();

            System.out.println(
                    "Vehicle Saved To Database");

        } catch (SQLException e) {

            System.out.println(
                    "Database Insert Failed");
        }
    }
    private void deleteVehicleFromDatabase(
        String registrationNumber) {

    try {

        Connection conn =
                DatabaseManager.connect();

        if (conn == null) {

            return;
        }

        String sql =
                "DELETE FROM vehicles "
                + "WHERE registration = ?";

        PreparedStatement pst =
                conn.prepareStatement(sql);

        pst.setString(1, registrationNumber);

        pst.executeUpdate();

        conn.close();

        System.out.println(
                "Vehicle Deleted From Database");

    } catch (SQLException e) {

        System.out.println(
                "Database Delete Failed");
    }
}
}
