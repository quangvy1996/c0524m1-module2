package bai_tap_them.model;

public class Car extends Vehicle {
    private int seatingCapacity;
    private String carType;
    public Car() {}
    public Car(String licensePlate,String manufacturer, int yearOfManufacture, String owner,int seatingCapacity, String carType) {
        super(licensePlate, manufacturer, yearOfManufacture, owner);
        this.seatingCapacity = seatingCapacity;
        this.carType = carType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public String toString() {
        return "Car{" +
                "seatingCapacity=" + seatingCapacity +
                ", carType='" + carType + '\'' +
                '}' + super.toString();
    }
}
