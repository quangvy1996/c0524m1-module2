package bai_tap.student_management.service.student_service;


import bai_tap.student_management.model.Student;

public interface IStudentService {
    Student[] findAll();
    void addStudent(Student student);
}
