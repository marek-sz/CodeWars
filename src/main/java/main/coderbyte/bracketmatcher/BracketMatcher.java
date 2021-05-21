package main.coderbyte.bracketmatcher;

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
}
