package ss2.bai_tap;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        while (count < 20) {
            boolean check = true;
            for (int i =2 ; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(N);
                count++;
            }
            N++;

        }

    }
}
