package ss14.thuc_hanh;

import java.util.Arrays;

public class Practice3 {
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,23,11,4,5,9,7,8,6};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
