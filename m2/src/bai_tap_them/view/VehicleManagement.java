package bai_tap_them.view;

import bai_tap_them.controller.car_controller.CarController;
import bai_tap_them.controller.motorbike_controller.MotorbikeController;
import bai_tap_them.controller.truck_controller.TruckController;

import java.util.Scanner;

public class VehicleManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarController carController = new CarController();
        TruckController truckController = new TruckController();
        MotorbikeController motorbikeController = new MotorbikeController();
        int choice;
        do {
            System.out.println("Quản lý phương tiện giao thông: \n" +
                    "1. Quản lý xe oto. \n" +
                    "2. Quản lý xe tải. \n" +
                    "3. Quản lý xe máy. \n" +
                    "4. Kết thúc. \n" +
                    "Xin chọn."
            );
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    carController.displayCarFunction();
                    break;
                case 2:
                    truckController.displayTruckFunction();
                    break;
                case 3:
                    motorbikeController.displayMotorbikeFunction();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
