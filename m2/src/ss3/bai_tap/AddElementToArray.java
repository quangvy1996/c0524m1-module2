package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element: " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter X");
        int x = sc.nextInt();
        System.out.println("Enter index");
        int index = sc.nextInt();
        if (index >= arr.length -1 || index <= -1) {
            System.out.println("Invalid index");
        }
        for (int i = arr.length-1; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = x;
        System.out.println(Arrays.toString(arr));
    }
}
