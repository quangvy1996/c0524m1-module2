package ss4.bai_tap.student_manager.controller;

import ss4.bai_tap.student_manager.service.StudentService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        while (true) {
            System.out.println("Chọn chức năng \n" +
                    "1.Hiển thị\n" +
                    "2.Thêm mới \n" +
                    "3.Xóa\n" +
                    "4.Thoat\n");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    // Hển thị
                    studentService.display();
                    break;
                case 2:
                    // thêm mới
                    studentService.add();
                    break;
                case 3:
                    // xóa
                    studentService.delete();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
