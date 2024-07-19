package bai_tap.student_management.repository.student_repo;

import bai_tap.student_management.model.Student;

import java.util.ArrayList;

public interface IStudentRepository {
    ArrayList<Student> findAll();
    void addStudent(Student student);
}
