package bai_tap_them.service.truck_service;

import bai_tap_them.model.Truck;
import bai_tap_them.repository.truck_repo.ITruckReposity;
import bai_tap_them.repository.truck_repo.TruckReposity;

import java.util.ArrayList;

public class TruckService implements ITruckService  {
    ITruckReposity truckRepo = new TruckReposity();

    @Override
    public ArrayList<Truck> findAll() {
       return truckRepo.findAll();
    }

    @Override
    public void addTruck(Truck truck) {
        truckRepo.addTruck(truck);
    }

    @Override
    public boolean removeTruck(Truck truck) {
        truckRepo.removeTruck(truck);
        return true;
    }

    @Override
    public Truck findTruckById(String licencePlate) {
        return truckRepo.findTruckById(licencePlate);
    }
}
