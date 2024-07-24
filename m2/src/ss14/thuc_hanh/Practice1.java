package ss14.thuc_hanh;

import java.util.Arrays;

public class Practice1 {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,23,11,4,5,9,7,8,6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
