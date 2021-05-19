package main.coderbyte.longestword;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
    public static String LongestWord(String sen) {
        return Arrays.stream(sen.trim().split(" "))
                .map(s -> s.replaceAll("\\W", ""))
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst().get();
    }
}
