package ss10.bai_tap.trien_khai_lop_list;

import bai_tap.student_management.model.Student;

import java.util.ArrayList;

public class Box2 {
    private Object element;

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public static void main(String[] args) {
        Student student = new Student();
        Box2 box = new Box2();
        box.setElement(5);
        box.setElement("hello");
        box.setElement(student);
        ((Student)box.getElement()).getClassName();
    }

}
