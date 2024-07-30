package bai_tap.student_management.model;

import java.time.LocalDate;

public class Student extends Person {
    private String className;

    public Student() {

    }

    public Student(String id, String name, LocalDate birthDate, String email, String phoneNumber, String className) {
        super(id, name, birthDate, email, phoneNumber);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void learn(String subject) {
        System.out.println("Học môn " + subject);
    }

    public String getInfoToCSV() {
        return super.getId() + "," + super.getName() + "," + super.getBirthDate() + "," + super.getEmail() + "," + super.getPhoneNumber() + "," + className;
    }
//    public static Student readFile(String fileName) {
//        String[] data = fileName.split(",");
//        String id = data[0];
//        String name = data[1];
//        LocalDate birthDate = LocalDate.parse(data[2]);
//        String email = data[3];
//        String phoneNumber = data[4];
//        String className = data[5];
//        return new Student(id,name,birthDate,email,phoneNumber,className);
//    }

    @Override
    public void say() {
        System.out.println("Dear teacher .....");
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                '}' + super.toString();
    }
}
