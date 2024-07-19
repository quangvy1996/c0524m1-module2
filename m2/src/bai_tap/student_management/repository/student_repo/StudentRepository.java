package bai_tap.student_management.repository.student_repo;

import bai_tap.student_management.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentRepository implements IStudentRepository {
    private static ArrayList<Student> list;

    static {
        list = new ArrayList<>();
        Student s1 = new Student("Thái Quang Vỹ", LocalDate.parse("2012-03-01"), "thaiquangvy1996@gmail.com", "0911144422", "C05");
        Student s2 = new Student("Phạm Trung Hiếu", LocalDate.parse("2011-04-01"), "phamtrunghieu@gmail.com", "0911133322", "C05");
        list.add(s1);
        list.add(s2);
    }

    @Override
    public ArrayList<Student> findAll() {
        //
        return list;
    }
    @Override
    public void addStudent(Student student) {
        list.add(student);

    }
}
