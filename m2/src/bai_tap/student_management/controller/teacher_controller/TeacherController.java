package bai_tap.student_management.controller.teacher_controller;


import bai_tap.student_management.model.Student;
import bai_tap.student_management.model.Teacher;
import bai_tap.student_management.service.teacher_service.ITeacherService;
import bai_tap.student_management.service.teacher_service.TeacherService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherController {
    private ITeacherService teacherService = new TeacherService();
    private Scanner sc = new Scanner(System.in);
    public void display(){
        ArrayList<Teacher> teachers = teacherService.findAll();
        for (Teacher teacher : teachers) {
            if(teacher != null)
            {System.out.println(teacher);};
        }
    }
    public void addTeacher() {
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        LocalDate birthday = LocalDate.parse(sc.nextLine());
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        System.out.println("Nhập sdt: ");
        String phone = sc.nextLine();
        System.out.println("Nhập cấp bậc: ");
        String level = sc.nextLine();

        Teacher teacher = new Teacher(name, birthday, email, phone, level);
        teacherService.addTeacher(teacher);
    }
    public void DisplayTeacherFunctional(){
        int choice;
        do {
            System.out.println("Quản lý Codegym: \n" +
                    "1. Hiển thị danh sách giảng viên. \n" +
                    "2. Thêm mới giảng viên. \n" +
                    "3. Chỉnh sửa thông tin giảng viên. \n" +
                    "4. Xóa giảng viên. \n" +
                    "5. Go back menu. \n" +
                    "Xin chọn");
            choice =Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 5:
                    return;


            }
        }
        while(true);
    }
}
