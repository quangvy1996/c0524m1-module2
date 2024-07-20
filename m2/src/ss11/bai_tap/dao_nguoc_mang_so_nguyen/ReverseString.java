package ss11.bai_tap.dao_nguoc_mang_so_nguyen;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String mWord = "Tôi là học viên CodeGym";
        Stack<String> wStack = new Stack<String>();

        String[] words = mWord.split("\\s+");
        for (String word : words) {
            wStack.push(word);
        }
        for (int i = 0; i < words.length; i++) {
            words[i] = wStack.pop();
        }
        System.out.println(Arrays.toString(words));
    }
}
