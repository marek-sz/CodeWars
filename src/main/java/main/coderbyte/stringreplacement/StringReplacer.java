package main.coderbyte.stringreplacement;

import java.util.Stack;

public class StringReplacer {
    public static String convertString(String string) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        char[] chars = string.toCharArray();
        for (Character character : chars) {
            if (stack.isEmpty()) {
                stack.push(character);
            } else if (character.equals(stack.lastElement())) {
                stack.push(character);
            } else {
                sb.append(stack.size()).append(stack.lastElement());
                stack.clear();
                stack.push(character);
            }
        }
        return sb.toString();
    }
}