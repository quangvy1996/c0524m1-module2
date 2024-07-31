package ss19.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPhoneNumber {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String phoneNumberRegex = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
        Pattern pattern = Pattern.compile(phoneNumberRegex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();

    }
    public static void main(String[] args) {
        String phone1 = "(84)-(0978489648)";
        System.out.println(isValidPhoneNumber(phone1));
        String phone2 = "(a8)-(22222222)";
        System.out.println(isValidPhoneNumber(phone2));
        String phone3 = "(84)-(22b22222)";
        System.out.println(isValidPhoneNumber(phone3));
        String phone4 = "(84)-(9978489648)";
        System.out.println(isValidPhoneNumber(phone4));
    }
}
