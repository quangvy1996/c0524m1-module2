package ss3.bai_tap;

import java.util.Scanner;

public class CountChararacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("String: " + str);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Chararacter is not in the string");
        } else {
            System.out.println("Appearance times: " + count);
        }
    }
}
