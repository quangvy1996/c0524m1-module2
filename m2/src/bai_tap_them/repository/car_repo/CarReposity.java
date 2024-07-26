package bai_tap_them.repository.car_repo;

import java.util.ArrayList;

import bai_tap_them.model.Car;

public class CarReposity implements ICarReposity {
    private static ArrayList<Car> carList;

    static {
        carList = new ArrayList<>();
        Car car1 = new Car("43B111", "Madzda", 2009, "Vỹ", 4, "tourist car");
        Car car2 = new Car("43B777", "Vios", 2010, "Hiếu", 7, "coach");
        carList.add(car1);
        carList.add(car2);
    }

    @Override
    public ArrayList<Car> findAll() {
        return carList;
    }

    @Override
    public void addCar(Car car) {
        carList.add(car);
    }

    @Override
    public boolean deleteCar(Car car) {
        carList.remove(car);
        return true;
    }

    @Override
    public Car findByLicensePlate(String licensePlate) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getLicensePlate().equals(licensePlate)) {
                return carList.get(i);
            }
        }
        return null;
    }
}
