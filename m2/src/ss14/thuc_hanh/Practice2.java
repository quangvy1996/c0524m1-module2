package ss14.thuc_hanh;

import java.util.Arrays;

public class Practice2 {
    public static void selectionSort(int[] array)
    {
        int min; // chỉ số phần tử nhỏ nhất trong dãy hiện hành
        for (int  i = 0; i < array.length - 1; i++){
            min = i;
            for(int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j; // ghi nhận vị trí phần tử nhỏ nhất
            if (min != i){
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,23,11,4,5,9,7,8,6};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
