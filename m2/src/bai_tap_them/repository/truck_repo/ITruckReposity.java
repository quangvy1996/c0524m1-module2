package bai_tap_them.repository.truck_repo;

import bai_tap_them.model.Truck;

import java.util.ArrayList;

public interface ITruckReposity {
    ArrayList<Truck> findAll();
    void addTruck(Truck truck);
    boolean removeTruck(Truck truck);
    Truck findTruckById(String licensePlate);
}
