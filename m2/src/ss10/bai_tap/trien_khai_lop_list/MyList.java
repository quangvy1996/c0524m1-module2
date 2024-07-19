package ss10.bai_tap.trien_khai_lop_list;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements = new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    public void add(int index, E element) {
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            elements[index] = element;
        }
    }

    public E remove(int index) {
        E element = (E) elements[index];
        for (int i = index; i <= elements.length - 1; i++) {
            if (i == elements.length - 1) {
                elements[i] = null;
            }
            elements[i] = elements[i + 1];
        }
        size--;
        return element;
    }

    public int size() {
        return size;
    }

    //    public E clone(){
//    }
    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity == elements.length) {
            E[] newArray = (E[]) new Object[minCapacity * 2];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
    }

    public void clear() {
        size = 0;
        E[] newArray = (E[]) new Object[DEFAULT_CAPACITY];
        elements = newArray;
    }
}


