package main.codewars.duplicateencoder;

public class DuplicateEncoder {
    static String encode(String word) {

        char[] chars = word.toLowerCase().toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            int counter = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    counter++;
                }
            }
            if (counter > 1) {
                stringBuilder.append(")");
            } else {
                stringBuilder.append("(");
            }

        }

        return stringBuilder.toString();
    }
}