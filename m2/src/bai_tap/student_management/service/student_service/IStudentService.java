package bai_tap.student_management.service.student_service;


import bai_tap.student_management.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void addStudent(Student student);
    void updateStudent(String id,Student updateStudent);
    Student findStudentById(String id);
    void deleteStudent(String id);
    Student searchStudentByName(String name);
}
