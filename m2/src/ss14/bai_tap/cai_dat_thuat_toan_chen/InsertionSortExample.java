package ss14.bai_tap.cai_dat_thuat_toan_chen;

public class InsertionSortExample {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            System.out.print("Bước " + i + ": ");
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.print("Dãy số ban đầu: ");
        printArray(arr);

        insertionSort(arr);

        System.out.print("Dãy số sau khi sắp xếp chèn: ");
        printArray(arr);
    }
}

