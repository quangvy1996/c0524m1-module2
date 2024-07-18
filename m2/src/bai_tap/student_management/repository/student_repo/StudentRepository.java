package bai_tap.student_management.repository.student_repo;

import bai_tap.student_management.model.Student;

import java.time.LocalDate;

public class StudentRepository implements IStudentRepository {
    private static Student[] list;
    static {
        list = new Student[5];
        Student s1 = new Student("Thái Quang Vỹ", LocalDate.parse("2012-03-01"),"thaiquangvy1996@gmail.com","0911144422","C05");
        Student s2 = new Student("Phạm Trung Hiếu", LocalDate.parse("2011-04-01"),"phamtrunghieu@gmail.com","0911133322","C05");
        list[0] = s1;
        list[1] = s2;
    }

    @Override
    public Student[] findAll() {
        //
        return list;
    }

    @Override
    public void addStudent(Student student) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = student;
                return;
            }

        }
    }
}
