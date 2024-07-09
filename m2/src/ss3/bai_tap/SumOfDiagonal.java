package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter element row " + i +" column " + j);
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Sum of diagonal: " + sum);
    }
}
