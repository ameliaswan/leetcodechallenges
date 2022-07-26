package dataStructures.stack;

import java.util.Stack;

public class DecodeString_394_M {
    public String decodeString(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder numSb = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ']') {
                stack.push(c);
            } else {
                while (stack.peek() != '[') {
                    sb.insert(0, stack.pop());
                }
                stack.pop();
                while (stack.size() > 0 && Character.isDigit(stack.peek())) {
                    numSb.insert(0, stack.pop());
                }
                //reconstruct
                int num = Integer.valueOf(numSb.toString());
                while (num > 0) {
                    for (char ch : sb.toString().toCharArray()) {
                        char tmpC = ch;
                        stack.push(tmpC);
                    }
                    num--;
                }
                sb = new StringBuilder();
                numSb = new StringBuilder();


            }

        }

        return stack.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .trim();

    }
}
