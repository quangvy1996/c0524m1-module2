package draft;

import java.io.*;


public class Draft {
    public static void main(String[] args) {

        Student student = new Student("Thái Quang Vỹ", 28);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("testReader.csv"));
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("testReader.csv"))) {
            objectOutputStream.writeObject(student);
            student = (Student) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

