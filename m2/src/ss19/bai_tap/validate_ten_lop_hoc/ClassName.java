package ss19.bai_tap.validate_ten_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Pattern pattern;


    private static final String className_regex = "\\b[CAP][0-9]{4}[GHIK]\\b";
    static {
        pattern = Pattern.compile(className_regex);
    }
    public ClassName() {
        pattern = Pattern.compile(className_regex);
    }
    public static boolean validate(String className){
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] validClassName = {"C0223G","A0323K"};
        String[] invalidClassName = {"M0318G","P0323A"};

        for(String className : validClassName){
            System.out.println(className + ": " + validate(className));
        }
        for(String className : invalidClassName){
            System.out.println(className + ": " + validate(className));
        }
    }
}
