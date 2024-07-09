package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerging {
    public static void main(String[] args) {
        int[] array1 = new int[4];
        int[] array2 = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array 1 size 4: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter element " + (i + 1));
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter array 2 size 5: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter element " + (i + 1));
            array2[i] = sc.nextInt();
        }
        System.out.println("Array 1: ");
        System.out.println(Arrays.toString(array1));
        System.out.println("Array 2: ");
        System.out.println(Arrays.toString(array2));
        int[] array3 = new int[9];
        for (int i = 0; i < array1.length; i++) {array3[i] = array1[i];}
        for (int i = array1.length ; i < array3.length; i++) {array3[i] = array2[i];}
    }
}
