package bai_tap_them.model;

abstract class Vehicle {
private String licensePlate;
private String manufacturer;
private int yearOfManufacture;
private String owner;

    public Vehicle(String licensePlate, String manufacturer,int yearOfManufacture, String owner) {
        this.yearOfManufacture = yearOfManufacture;
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.owner = owner;
    }
    public Vehicle(){}

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return
                "licensePlate='" + licensePlate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                '}';
    }
}