package bai_tap.student_management.repository.student_repo;

import bai_tap.student_management.model.Student;

public interface IStudentRepository {
    Student[] findAll();
}
