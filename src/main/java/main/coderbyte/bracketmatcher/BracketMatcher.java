package main.coderbyte.bracketmatcher;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BracketMatcher {
    public static int bracketMatcher(String string) {
        String formatted = string.trim().replaceAll("\\w|\\s", "");
        Pattern pattern = Pattern.compile("()");
        Matcher matcher = pattern.matcher(formatted);

        while (matcher.find()) {
            formatted = formatted.replace("()", "");
        }

        return formatted.isEmpty() ? 1 : 0;
    }

    public static int stackApproach(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (stack.isEmpty()) {
                switch (c) {
                    case '(':
                        stack.push(c);
                        break;
                    case ')':
                        return 0;
                }
            } else {
                switch (c) {
                    case '(':
                        stack.push(c);
                        break;
                    case ')':
                        stack.pop();
                        break;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}