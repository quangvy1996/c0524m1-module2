package ss11.bai_tap.dao_nguoc_mang_so_nguyen;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] array = new int[4];
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println(stack);
    }
}
