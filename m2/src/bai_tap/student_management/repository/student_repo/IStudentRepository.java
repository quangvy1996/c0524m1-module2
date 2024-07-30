package bai_tap.student_management.repository.student_repo;

import bai_tap.student_management.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    void addStudent(Student student);
    void updateStudent(String id, Student updatedStudent);
    Student findStudentById(String id);
    void deleteStudent(String id);
    Student searchStudentByName(String name);
}
