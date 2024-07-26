package bai_tap_them.repository.car_repo;

import bai_tap_them.model.Car;

import java.util.ArrayList;

public interface ICarReposity {
    ArrayList<Car> findAll();
    void addCar(Car car);
    boolean deleteCar(Car car);
    Car findByLicensePlate(String licensePlate);
}
