public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String make, String model, int year,
               String registrationNumber, int numberOfDoors) {
        super(make, model, year, registrationNumber);
        this.numberOfDoors = numberOfDoors;
    }
    
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public String getVehicleType() {
        return "Car";
    }
    @Override
    public String displayInfo() {
        return "Type: Car"
                + "\nMake: " + getMake()
                + "\nModel: " + getModel()
                + "\nYear: " + getYear()
                + "\nRegistration Number: " + getRegistrationNumber()
                + "\nDoors: " + numberOfDoors
                + "\n-------------------------";
    }
}