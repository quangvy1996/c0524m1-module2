package ss15.bai_tap.illegal_triangle_exception;

import java.util.Scanner;
class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh 1: ");
        double side1 = sc.nextDouble();
        System.out.println("Nhập độ dài cạnh 2: ");
        double side2 = sc.nextDouble();
        System.out.println("Nhập độ dài cạnh 3: ");
        double side3 = sc.nextDouble();
        try {
            checkTriangle(side1, side2, side3);
            System.out.println("Các cạnh hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    static void checkTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new IllegalTriangleException("giá trị âm");
        } else if (side1 + side2 < side3 || side2 + side3 < side1 || side3 + side1 < side2) {
            throw new IllegalTriangleException("Hai cạnh bé hơn 1 cạnh");
        }
    }
}



