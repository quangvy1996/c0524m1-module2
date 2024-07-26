package bai_tap_them.service.car_service;

import bai_tap_them.model.Car;

import java.util.ArrayList;

public interface ICarService {
    ArrayList<Car> findAll();
    void addCar(Car car);
    boolean deleteCar(Car car);
    Car findCarById(String licencePlate);
}
