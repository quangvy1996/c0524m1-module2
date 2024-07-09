package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class EraseElementFromArray {
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
        System.out.println("Enter X: ");
        int x = sc.nextInt();
        int index;
        int count = 0;
        for (int value : arr) {
            if (value == x) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Element not found");
        } else {
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == x) {
                        index = j;
                        for (int k = index; k < arr.length - 1; k++) {
                            arr[k] = arr[k + 1];
                        }
                        arr[arr.length - 1 - i] = 0;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
