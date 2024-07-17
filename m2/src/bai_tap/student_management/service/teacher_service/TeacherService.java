package bai_tap.student_management.service.teacher_service;

import bai_tap.student_management.model.Teacher;
import bai_tap.student_management.repository.teacher_repo.ITeacherRepository;
import bai_tap.student_management.repository.teacher_repo.TeacherRepository;

public class TeacherService implements ITeacherService {
    private ITeacherRepository teacherRepo = new TeacherRepository();
    @Override
    public Teacher[] findAll() {
        return teacherRepo.findAll();
    }
}
