package bai_tap_them.service.motobike_service;

import bai_tap_them.model.Motorbike;
import bai_tap_them.repository.motorbike_repo.IMotorbikeRepository;
import bai_tap_them.repository.motorbike_repo.MotorbikeReposity;

import java.util.ArrayList;

public class MotorbikeService implements IMotorbikeService {
    private IMotorbikeRepository motorbikeRepository = new MotorbikeReposity();
    @Override
    public ArrayList<Motorbike> findAll() {

        return motorbikeRepository.findAll();
    }

    @Override
    public void addMotorbike(Motorbike motorbike) {
        motorbikeRepository.addMotorbike(motorbike);
    }

    @Override
    public boolean removeMotorbike(Motorbike motorbike) {
        motorbikeRepository.removeMotorbike(motorbike);
        return true;
    }

    @Override
    public Motorbike findMotorbikeById(String licensePlate) {
        motorbikeRepository.findMotorbikeById(licensePlate);
        return null;
    }
}
