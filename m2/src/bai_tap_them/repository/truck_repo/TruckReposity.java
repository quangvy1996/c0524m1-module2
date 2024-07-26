package bai_tap_them.repository.truck_repo;

import bai_tap_them.model.Truck;

import java.util.ArrayList;

public class TruckReposity implements ITruckReposity {
    private static ArrayList<Truck> truckList;

    static {
        truckList = new ArrayList<>();
        Truck truck1 = new Truck("50C33245","KIA",2015,"Mẫn",3.6);
        Truck truck2 = new Truck("50C33245","Isuzu",2013,"Linh",2.8);
        truckList.add(truck1);
        truckList.add(truck2);
    }

    @Override
    public ArrayList<Truck> findAll() {
        return truckList;
    }

    @Override
    public void addTruck(Truck truck) {
    truckList.add(truck);
    }

    @Override
    public boolean removeTruck(Truck truck) {
        truckList.remove(truck);
        return true;
    }

    @Override
    public Truck findTruckById(String licensePlate) {
        for (int i = 0; i < truckList.size(); i++) {
            if (truckList.get(i).getLicensePlate().equals(licensePlate)) {
                return truckList.get(i);
            }
        }
        return null;
    }
}
