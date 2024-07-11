package ss4.bai_tap.student_manager.service;

import ss4.bai_tap.student_manager.model.Student;
import ss4.bai_tap.student_manager.model.Teacher;

import java.util.Scanner;

public class TeacherService {

    private static Teacher[] teachers = new Teacher[100];
    private Scanner scanner = new Scanner(System.in);

    static {
        teachers[0] = new Teacher(1, "cong1");
        teachers[1] = new Teacher(2, "cong2");
        teachers[2] = new Teacher(3, "cong3");
    }

    // class chức năng chứa các method CRUD : create , Read, Update, Delete
    public void display() {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null) {
                System.out.println(teachers[i]);
            }
        }
    }
    public void add() {
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name");
        String name = scanner.nextLine();
        Teacher teacher = new Teacher(id, name);
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i]==null) {
                teachers[i] = teacher;
                break;
            }
        }
    }
    public void delete() {
        System.out.println("nhập id cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i]!=null){
                if (teachers[i].getId() == id) {
                    for (int j = i; j < teachers.length-1 ; j++) {
                        teachers[j]= teachers[j+1];
                    }
                    flag = true;
                    teachers[teachers.length-1]=null;
                    System.out.println("Đã xóa thành công");
                    break;
                }
            }else {
                break;
            }


        }
        if (!flag){
            System.out.println("Không tìm thấy id");
        }
    }
}
