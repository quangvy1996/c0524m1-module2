package bai_tap.student_management.repository.student_repo;

import bai_tap.student_management.model.Student;
import bai_tap.student_management.util.ReadAndWrite;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class StudentRepository implements IStudentRepository {
    public static final String PATH = "src/bai_tap/student_management/data/student_mvc.csv";


    @Override
    public List<Student> findAll() {
        List<String> stringList = ReadAndWrite.readFileCSVToListString(PATH);
        List<Student> studentList = new ArrayList<>();
        String[] array = null;
        for (String s : stringList) {
            array = s.split(",");
            Student student = new Student(array[0], array[1], LocalDate.parse(array[2]), array[3], array[4], array[5]);
            studentList.add(student);
        }
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        List<String> stringList = new ArrayList<>();
        stringList.add(student.getInfoToCSV());
        ReadAndWrite.writeStringListToFile(PATH, stringList, true);
    }

        @Override
    public void updateStudent(String id, Student updatedStudent) {
            List<Student> studentList = findAll();
            for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.set(i, updatedStudent);
            }
                List<String> stringList = new ArrayList<>();
                for (Student student : studentList) {
                    stringList.add(student.getInfoToCSV());
                }
                ReadAndWrite.writeStringListToFile(PATH, stringList, false);
        }
    }

    @Override
    public Student findStudentById(String id) {
        List<Student> studentList = findAll();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                return studentList.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteStudent(String id) {
        List<Student> studentList = findAll();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.remove(i);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Student student : studentList) {
            stringList.add(student.getInfoToCSV());
        }
        ReadAndWrite.writeStringListToFile(PATH, stringList, false);
    }

    @Override
    public Student searchStudentByName(String name) {
        List<Student> studentList = findAll();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().contains(name)) {
                return studentList.get(i);
            }
        }
        return null;
    }

}


