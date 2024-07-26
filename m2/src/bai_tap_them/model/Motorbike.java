package bai_tap_them.model;

public class Motorbike extends Vehicle {
    private double wattage;

    public Motorbike() {
    }

    public Motorbike(String licensePlate, String manufacturer, int yearOfManufacture, String owner, double wattage) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "wattage=" + wattage +
                '}'+super.toString();
    }
}
