package ss4.bai_tap.student_manager.controller;

import ss4.bai_tap.student_manager.service.StudentService;
import ss4.bai_tap.student_manager.service.TeacherService;

import java.util.Scanner;

public class MainController {
     private static   Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        while (true) {
            System.out.println("Chọn đối tượng quản lý \n" +
                    "1.Student\n" +
                    "2.Teacher \n" +
                    "3.Thoat\n");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    // Hển thị
                    studentMenu();
                    break;
                case 2:
                    // thêm mới
                    teacherMenu();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
    public static void studentMenu(){
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
                    return;
            }
        }
    }
    public static void teacherMenu(){
        TeacherService teacherService = new TeacherService();
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
                    teacherService.display();
                    break;
                case 2:
                    // thêm mới
                    teacherService.add();
                    break;
                case 3:
                    // xóa
                    teacherService.delete();
                    break;
                default:
                    return;
            }
        }
    }
}
