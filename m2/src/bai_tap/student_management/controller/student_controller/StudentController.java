package bai_tap.student_management.controller.student_controller;

import bai_tap.student_management.model.Student;
import bai_tap.student_management.service.student_service.IStudentService;
import bai_tap.student_management.service.student_service.StudentService;

import java.time.LocalDate;
import java.util.Scanner;


public class StudentController {
    private IStudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);

    public void display() {
        Student[] students = studentService.findAll();
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
            ;
        }
    }

    public void addStudent() {
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        LocalDate birthday = LocalDate.parse(sc.nextLine());
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        System.out.println("Nhập sdt: ");
        String phone = sc.nextLine();
        System.out.println("Nhập tên lớp: ");
        String className = sc.nextLine();

        Student student1 = new Student(name, birthday, email, phone, className);
        studentService.addStudent(student1);
    }

    public void DisplayStudentFunctional() {
        int choice;
        do {
            System.out.println("Quản lý Codegym: \n" +
                    "1. Hiển thị danh sách học viên. \n" +
                    "2. Thêm mới học viên. \n" +
                    "3. Chỉnh sửa thông tin học viên. \n" +
                    "4. Xóa học viên. \n" +
                    "5. Go back menu. \n" +
                    "Xin chọn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    addStudent();
                    break;
                case 4:
                    break;
                case 5:
                    return;


            }
        }
        while (true);
    }
}
