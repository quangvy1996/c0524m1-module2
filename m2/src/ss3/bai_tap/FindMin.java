package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element at position " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min is: " + min);
    }
}
