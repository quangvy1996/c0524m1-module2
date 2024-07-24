package ss13.bai_tap.tim_kiem_nhi_phan_su_dung_de_quy;

public class Exercise {
    public static void  binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return;
        }
        int mid = (left + right) / 2;
        if (array[mid] == value) {
            System.out.println(array[mid]);
        }
        if (value > array[mid]) {
            if (left <= mid) {
                binarySearch(array, mid - 1, right, value);
            }
        }
        if (value < array[mid]) {
            if (right >= mid) {
                binarySearch(array, left, mid + 1, value);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,5,7,8,10};
        binarySearch(array, 0, array.length - 1, 7);
    }
}
