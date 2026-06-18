public abstract class Vehicle implements Displayable {

    private String make;
    private String model;
    private int year;
    private String registrationNumber;

    public Vehicle(String make, String model, int year, String registrationNumber) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.registrationNumber = registrationNumber;
    }
    
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public abstract String getVehicleType();
}