package bai_tap_them.controller.motorbike_controller;


import bai_tap_them.model.Motorbike;

import bai_tap_them.service.motobike_service.IMotorbikeService;
import bai_tap_them.service.motobike_service.MotorbikeService;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeController {
    private IMotorbikeService motorbikeService = new MotorbikeService();
    private Scanner scanner = new Scanner(System.in);
    public void addMotorbike() {
        System.out.println("Nhập biển kiểm soát");
        String newLicensePlate = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất");
        String newManufacturer = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int newYearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu");
        String newOwner = scanner.nextLine();
        System.out.println("Nhập công suất");
        double newWattage = Double.parseDouble(scanner.nextLine());

        Motorbike motorbike1 = new Motorbike(newLicensePlate, newManufacturer, newYearOfManufacture, newOwner,newWattage );
        motorbikeService.addMotorbike(motorbike1);
    }

    public void display() {
        ArrayList<Motorbike> motorbikes = motorbikeService.findAll();
        for (Motorbike motorbike : motorbikes) {
            System.out.println(motorbike);
        }
    }

    public void deleteMotorbike() {
        System.out.println("Nhập biển kiểm soát xe cần xóa");
        String licensePlate = scanner.nextLine();

        Motorbike existingMotorbike = motorbikeService.findMotorbikeById(licensePlate);
        if (existingMotorbike == null) {
            System.out.println("Không tìm thấy xe yêu cầu");
            return;
        }
        System.out.println("Thông tin xe yêu cầu xóa");
        System.out.println(existingMotorbike);
        if (motorbikeService.removeMotorbike(existingMotorbike)) {
            System.out.println("Xóa thành công");
        }
    }

    public void searchMotorbike() {
        System.out.println("Nhập biển kiểm soát xe");
        String licensePlate = scanner.nextLine();

        Motorbike existingMotorbike = motorbikeService.findMotorbikeById(licensePlate);
        if (existingMotorbike == null) {
            System.out.println("Không tìm thấy xe yêu cầu");
            return;
        }
        System.out.println(existingMotorbike);
    }

    public void displayMotorbikeFunction() {
        int choice;
        do {
            System.out.println("Quản lý xe máy: \n" +
                    "1. Thêm mới xe máy. \n" +
                    "2. Hiển thị xe máy. \n" +
                    "3. Xóa xe máy: \n" +
                    "4. Tìm kiếm xe máy theo biển kiểm soát. \n" +
                    "5. Thoát.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addMotorbike();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    deleteMotorbike();
                    break;
                case 4:
                    searchMotorbike();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
