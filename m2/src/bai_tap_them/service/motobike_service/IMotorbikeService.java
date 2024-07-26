package bai_tap_them.service.motobike_service;

import bai_tap_them.model.Motorbike;

import java.util.ArrayList;

public interface IMotorbikeService {
    ArrayList<Motorbike> findAll();
    void addMotorbike(Motorbike motorbike);
    boolean removeMotorbike(Motorbike motorbike);
    Motorbike findMotorbikeById(String licensePlate);
}
