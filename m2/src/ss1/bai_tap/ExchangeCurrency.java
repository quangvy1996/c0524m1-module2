package ss1.bai_tap;

import java.util.Scanner;

public class ExchangeCurrency {
    public static void main(String[] args) {
        float vn = 24000;
        float usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter usd: ");
        usd = sc.nextFloat();
        float exchangeRate = usd * vn;
        System.out.println("Giá trị VND: " + exchangeRate);
        }
    }

