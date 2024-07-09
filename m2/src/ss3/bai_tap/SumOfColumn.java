package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the array: ");
        int row = sc.nextInt();
        System.out.println("Enter the column of the array: ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter element row " + i +" column " + j);
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Enter the column need to sum ");
        int col = sc.nextInt();
        int sum = 0;
        for ( row = 0; row < matrix.length; row++) {
            sum += matrix[row][col];}
        System.out.println("Sum is: " + sum);
    }

}
