package bai_tap_them.controller.car_controller;

import bai_tap_them.model.Car;
import bai_tap_them.service.car_service.CarService;
import bai_tap_them.service.car_service.ICarService;

import java.util.ArrayList;
import java.util.Scanner;

public class CarController {
    private ICarService carService = new CarService();
    private Scanner scanner = new Scanner(System.in);

    public void addCar() {
        System.out.println("Nhập biển kiểm soát");
        String newLicensePlate = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất");
        String newManufacturer = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int newYearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu");
        String newOwner = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi");
        int newSeatingCapacity = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe");
        String newCarType = scanner.nextLine();
        Car car1 = new Car(newLicensePlate, newManufacturer, newYearOfManufacture, newOwner, newSeatingCapacity, newCarType);
        carService.addCar(car1);
    }

    public void display() {
        ArrayList<Car> cars = carService.findAll();
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public void deleteCar() {
        System.out.println("Nhập biển kiểm soát xe cần xóa");
        String licensePlate = scanner.nextLine();

        Car existingCar = carService.findCarById(licensePlate);
        if (existingCar == null) {
            System.out.println("Không tìm thấy xe yêu cầu");
            return;
        }
        System.out.println("Thông tin xe yêu cầu xóa");
        System.out.println(existingCar);
        if (carService.deleteCar(existingCar)) {
            System.out.println("Xóa thành công");
        }
    }

    public void searchCar() {
        System.out.println("Nhập biển kiểm soát xe");
        String licensePlate = scanner.nextLine();

        Car existingCar = carService.findCarById(licensePlate);
        if (existingCar == null) {
            System.out.println("Không tìm thấy xe yêu cầu");
            return;
        }
        System.out.println(existingCar);
    }

    public void displayCarFunction() {
        int choice;
        do {
            System.out.println("Quản lý Oto: \n" +
                    "1. Thêm mới oto. \n" +
                    "2. Hiển thị oto. \n" +
                    "3. Xóa oto: \n" +
                    "4. Tìm kiếm oto theo biển kiểm soát. \n" +
                    "5. Thoát.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addCar();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    deleteCar();
                    break;
                case 4:
                    searchCar();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
