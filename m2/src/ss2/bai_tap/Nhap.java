package ss2.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Nhap {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước m");
        int m = sc.nextInt();
        System.out.println("Nhập kích thước n");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter rows " + i + "  and cols " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
