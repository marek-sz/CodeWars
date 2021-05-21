package main.coderbyte.stringreplacement;

import java.util.Stack;

public class StringReplacer {
    public static String convertString(String string) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(string.charAt(i));
            } else if (string.charAt(i) == stack.lastElement()) {
                stack.push(string.charAt(i));
            } else {
                sb.append(stack.size());
                sb.append(stack.pop());
                stack.clear();
            }
        }
        return sb.toString();
    }

}
