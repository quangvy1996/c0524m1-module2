package bai_tap_them.service.truck_service;

import bai_tap_them.model.Truck;

import java.util.ArrayList;

public interface ITruckService {
    ArrayList<Truck> findAll();
    void addTruck(Truck truck);
    boolean removeTruck(Truck truck);
    Truck findTruckById(String licencePlate);

}
