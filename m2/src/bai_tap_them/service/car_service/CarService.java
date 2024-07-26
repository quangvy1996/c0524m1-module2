package bai_tap_them.service.car_service;

import bai_tap_them.model.Car;
import bai_tap_them.repository.car_repo.CarReposity;
import bai_tap_them.repository.car_repo.ICarReposity;

import java.util.ArrayList;

public class CarService implements ICarService {
    private ICarReposity carReposity = new CarReposity();
    @Override
    public ArrayList<Car> findAll() {
        return carReposity.findAll();
    }

    @Override
    public void addCar(Car car) {
        carReposity.addCar(car);
    }

    @Override
    public boolean deleteCar(Car car) {
        carReposity.deleteCar(car);
        return true;
    }

    @Override
    public Car findCarById(String licencePlate) {
        return carReposity.findByLicensePlate(licencePlate);
    }
}
