public class Motorcycle extends Vehicle {

    private boolean hasHelmet;

    public Motorcycle(String make, String model, int year,
                      String registrationNumber, boolean hasHelmet) {
        super(make, model, year, registrationNumber);
        this.hasHelmet = hasHelmet;
    }

    public boolean isHasHelmet() {
        return hasHelmet;
    }
    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }
    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }
    @Override
    public String displayInfo() {
        return "Type: Motorcycle"
                + "\nMake: " + getMake()
                + "\nModel: " + getModel()
                + "\nYear: " + getYear()
                + "\nRegistration Number: " + getRegistrationNumber()
                + "\nHelmet Included: " + hasHelmet
                + "\n-------------------------";
    }
}