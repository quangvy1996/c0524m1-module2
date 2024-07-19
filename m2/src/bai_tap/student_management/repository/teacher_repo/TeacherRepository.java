package bai_tap.student_management.repository.teacher_repo;

import bai_tap.student_management.model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;

public class TeacherRepository implements ITeacherRepository {
    private static ArrayList<Teacher> list;
    static {
        list = new ArrayList<>();
        Teacher t1 = new Teacher("Chánh", LocalDate.parse("1983-02-01"),"chanhtran@gmail.com","0904456789","Giảng viên");
        Teacher t2 = new Teacher("Công", LocalDate.parse("1993-02-06"),"congdang@gmail.com","0987456123","Giảng viên");
       list.add(t1);
       list.add(t2);

    }

    @Override
    public ArrayList<Teacher> findAll() {
        return list;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        list.add(teacher);
    }
}
