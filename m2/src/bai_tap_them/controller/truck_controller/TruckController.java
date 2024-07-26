package bai_tap_them.controller.truck_controller;

import bai_tap_them.model.Truck;
import bai_tap_them.service.truck_service.TruckService;
import java.util.ArrayList;
import java.util.Scanner;

public class TruckController {
    private TruckService truckService = new TruckService();
    Scanner scanner = new Scanner(System.in);

    public void addTruck() {
        System.out.println("Nhập biển kiểm soát");
        String newLicensePlate = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất");
        String newManufacturer = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int newYearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu");
        String newOwner = scanner.nextLine();
        System.out.println("Nhập trọng tải");
        double newTruckLoad = Double.parseDouble(scanner.nextLine());

        Truck truck1 = new Truck(newLicensePlate, newManufacturer, newYearOfManufacture, newOwner, newTruckLoad);
        truckService.addTruck(truck1);
    }

    public void display() {
        ArrayList<Truck> trucks = truckService.findAll();
        for (Truck truck : trucks) {
            System.out.println(truck);
        }
    }

    public void deleteTruck() {
        System.out.println("Nhập biển kiểm soát xe cần xóa");
        String licensePlate = scanner.nextLine();

        Truck existingTruck = truckService.findTruckById(licensePlate);
        if (existingTruck == null) {
            System.out.println("Không tìm thấy xe yêu cầu");
            return;
        }
        System.out.println("Thông tin xe yêu cầu xóa");
        System.out.println(existingTruck);
        if (truckService.removeTruck(existingTruck)) {
            System.out.println("Xóa thành công");
        }
    }

    public void searchTruck() {
        System.out.println("Nhập biển kiểm soát xe");
        String licensePlate = scanner.nextLine();

        Truck existingTruck = truckService.findTruckById(licensePlate);
        if (existingTruck != null) {
            System.out.println("Không tìm thấy xe yêu cầu");
        }
        System.out.println(existingTruck);
    }

    public void displayTruckFunction() {
        int choice;
        do {
            System.out.println("Quản lý xe tải: \n" +
                    "1. Thêm mới xe tải. \n" +
                    "2. Hiển thị xe tải. \n" +
                    "3. Xóa xe tải: \n" +
                    "4. Tìm kiếm xe tải theo biển kiểm soát. \n" +
                    "5. Thoát.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addTruck();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    deleteTruck();
                    break;
                case 4:
                    searchTruck();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }

}
