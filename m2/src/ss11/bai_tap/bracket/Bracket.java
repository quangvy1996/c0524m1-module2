package ss11.bai_tap.bracket;

import java.util.Stack;

public class Bracket {
    public static boolean hasABracket(String str) {
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                bStack.push(str.charAt(i));
            }
            if (str.charAt(i) == ')') {
                if (bStack.empty()) {
                    return false;
                }
                char left = bStack.pop();
                if (str.charAt(i) == ')' && left != '(') {
                    return false;
                }
            }

        }
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        String sym = "s * (s – a) * (s – b) * (s – c)";
        System.out.println(hasABracket(sym));
        String sym2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        System.out.println(hasABracket(sym2));
        String sym3 = "s * (s – a) * (s – b * (s – c) ";
        System.out.println(hasABracket(sym3));
        String sym4 = "s * (s – a) * s – b) * (s – c)";
        System.out.println(hasABracket(sym4));
        String sym5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        System.out.println(hasABracket(sym5));
    }
}
