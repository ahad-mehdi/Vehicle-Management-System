public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(String make, String model, int year,
                 String registrationNumber, double loadCapacity) {
        super(make, model, year, registrationNumber);
        this.loadCapacity = loadCapacity;
    }
    
    public double getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    @Override
    public String getVehicleType() {
        return "Truck";
    }
    @Override
    public String displayInfo() {
        return "Type: Truck"
                + "\nMake: " + getMake()
                + "\nModel: " + getModel()
                + "\nYear: " + getYear()
                + "\nRegistration Number: " + getRegistrationNumber()
                + "\nLoad Capacity: " + loadCapacity + " tons"
                + "\n-------------------------";
    }
}