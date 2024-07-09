package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of the array: ");
        int row = sc.nextInt();
        System.out.println("Enter the column of the array: ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Nhập phần tử hàng " + i +" cột " + j);
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        int max = matrix[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Max is: "+max);
        System.out.println("At coordinates of " + x + ", " + y);
    }

}
