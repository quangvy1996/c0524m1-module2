package bai_tap.student_management.repository.teacher_repo;

import bai_tap.student_management.model.Teacher;

import java.time.LocalDate;

public class TeacherRepository implements ITeacherRepository {
    private static Teacher[] list;
    static {
        list = new Teacher[5];
        Teacher t1 = new Teacher("Chánh", LocalDate.parse("1983-02-01"),"chanhtran@gmail.com","0904456789","Giảng viên");
        Teacher t2 = new Teacher("Công", LocalDate.parse("1993-02-06"),"congdang@gmail.com","0987456123","Giảng viên");
        list[0] = t1;
        list[1] = t2;
    }

    @Override
    public Teacher[] findAll() {
        return list;
    }
}
