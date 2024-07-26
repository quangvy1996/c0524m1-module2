package bai_tap_them.repository.motorbike_repo;

import bai_tap_them.model.Motorbike;

import java.util.ArrayList;

public class MotorbikeReposity implements IMotorbikeRepository {
    private static ArrayList<Motorbike> motorbikeList;


    static {
        motorbikeList = new ArrayList<>();
        Motorbike motobike1 = new Motorbike("36A12345", "Suzuki", 2017, "Hào", 123);
        Motorbike motobike2 = new Motorbike("36A12645", "Yamaha", 2013, "Công", 123);
        motorbikeList.add(motobike1);
        motorbikeList.add(motobike2);
    }

    @Override
    public ArrayList<Motorbike> findAll() {
        return motorbikeList;
    }

    @Override
    public void addMotorbike(Motorbike motorbike) {
        motorbikeList.add(motorbike);
    }

    @Override
    public boolean removeMotorbike(Motorbike motorbike) {
        motorbikeList.remove(motorbike);
        return true;
    }

    @Override
    public Motorbike findMotorbikeById(String licensePlate) {
        for (Motorbike motorbike : motorbikeList) {
            if (motorbike.getLicensePlate().equals(licensePlate)) {
                return motorbike;
            }
        }
        return null;
    }

}
