package bai_tap.student_management.service.student_service;

import bai_tap.student_management.model.Student;
import bai_tap.student_management.repository.student_repo.IStudentRepository;
import bai_tap.student_management.repository.student_repo.StudentRepository;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();
    @Override
    public Student[] findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }
}
