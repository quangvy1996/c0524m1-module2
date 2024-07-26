package bai_tap_them.model;

public class Truck extends Vehicle {
    private double truckLoad;

    public Truck() {
    }

    public Truck(String licensePlate, String manufacturer, int yearOfManufacture, String owner, double truckLoad) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.truckLoad = truckLoad;
    }

    public double getTruckLoad() {
        return truckLoad;
    }

    public void setTruckLoad(double truckLoad) {
        this.truckLoad = truckLoad;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "truckLoad=" + truckLoad +
                '}' + super.toString();
    }
}

