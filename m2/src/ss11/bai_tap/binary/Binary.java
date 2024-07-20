package ss11.bai_tap.binary;

import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int inputNumber = 18;
        while (inputNumber > 0) {
            int digit = inputNumber % 2;
            stack.push(digit);
            inputNumber /= 2;
        }
        StringBuilder binaryStr = new StringBuilder();
       while (!stack.isEmpty()) {
           binaryStr.append(stack.pop());
       }
       System.out.println(binaryStr);
        }

    }

