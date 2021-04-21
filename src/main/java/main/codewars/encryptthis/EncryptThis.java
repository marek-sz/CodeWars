package main.codewars.encryptthis;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EncryptThis {
    public static String encryptThis(String word) {
        return Arrays.stream(word.split(" "))
                .map(w -> w.length() > 2 ? (int) w.charAt(0) + w.substring(w.length() - 1) + w.substring(2, w.length() - 1) + w.substring(1, 2) :
                        w.length() > 1 ? (int) w.charAt(0) + w.substring(1) :
                                w.length() == 1 ? (int) w.charAt(0) + "" : "")
                .collect(Collectors.joining(" "));
    }
}