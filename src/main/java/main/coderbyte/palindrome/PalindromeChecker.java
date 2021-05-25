package main.coderbyte.palindrome;

import java.util.Optional;

public class PalindromeChecker {
    public static String checkIfPalindrome(String string) {
        final String success = "palindrome";
        final String failure = "not palindrome";
        Optional<String> empty = Optional.of(string);

        for (int i = 0; i < string.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder(string);
            String formatted = stringBuilder.deleteCharAt(i).toString();
            String reversed = new StringBuilder(formatted).reverse().toString();
            if (formatted.equals(reversed)) {
                return success;
            }
            for (int j = i + 1; j < string.length() - 1; j++) {
                StringBuilder innerStringBuilder = new StringBuilder(formatted);
                String innerFormatted = innerStringBuilder.deleteCharAt(j).toString();
                String innerReversed = new StringBuilder(innerFormatted).reverse().toString();
                if (innerFormatted.equals(innerReversed)) {
                    return success;
                }
            }
        }
        empty.orElse(failure)
        return failure;
    }
}
//check if word is palindrome after removing 1 or 2 characters