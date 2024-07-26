package bai_tap_them.repository.motorbike_repo;

import bai_tap_them.model.Motorbike;

import java.util.ArrayList;

public interface IMotorbikeRepository {
    ArrayList<Motorbike> findAll();
    void addMotorbike(Motorbike motorbike);
    boolean removeMotorbike(Motorbike motorbike);
    Motorbike findMotorbikeById(String licensePlate);
}
