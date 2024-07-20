package ss11.bai_tap.kiem_tra_chuoi_palindrome_trong_queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        string = string.toLowerCase();
        System.out.println(string);
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            stack.push(c);
            queue.add(c);
        }
        System.out.println(stack);
        System.out.println(queue);

        while (!queue.isEmpty()) {
            char char1 = stack.pop();
            char char2 = queue.remove();
            if (char1 != char2) {
                System.out.println("Not a palindrome.");
            } else {
                System.out.println("Palindrome.");
                break;
            }
        }
    }
}


