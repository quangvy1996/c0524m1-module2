package ss10.bai_tap.trien_khai_lop_list;

import bai_tap.student_management.model.Student;

import java.util.ArrayList;

public class Box<E> {
    private E element;

    public Box() {
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setElement(1);
        Box<String> stringBox = new Box<>();
        Box<Student> box1 = new Box<>();
        box1.setElement(new Student());
        box1.getElement().getClassName();

        ArrayList<Integer> arrayList = new ArrayList();// kiểu object
        arrayList.add(1); // 1 là kieu int ???????????????
        // Wrapper class : int => Interger, double => Double, float => Float char => Character
        // kiểu nguyên thủy int, float, double : chỉ có thể lưu được giá trí:
        // Đối tương Interger, Double => có lưu giá trị + có các phương thức
        // parse

    }

}
