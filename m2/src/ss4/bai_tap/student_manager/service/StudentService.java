package ss4.bai_tap.student_manager.service;

import ss4.bai_tap.student_manager.model.Student;

import java.util.Scanner;

public class StudentService {
    private static Student[] studentList = new Student[100];
    private  Scanner scanner = new Scanner(System.in);

    static {
        studentList[0] = new Student(1, "chánh1");
        studentList[1] = new Student(2, "chánh2");
        studentList[2] = new Student(2, "chánh3");
    }

    // class chức năng chứa các method CRUD : create , Read, Update, Delete
    public void display() {
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                System.out.println(studentList[i]);
            }
        }
    }
    public void add() {
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name");
        String name = scanner.nextLine();
        Student student = new Student(id, name);
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i]==null) {
                studentList[i] = student;
                break;
            }
        }
    }
    public void delete() {
        System.out.println("nhập id cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i]!=null){
                if (studentList[i].getId() == id) {
                    for (int j = i; j <studentList.length-1 ; j++) {
                        studentList[j]=studentList[j+1];
                    }
                    flag = true;
                    studentList[studentList.length-1]=null;
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
