package main.codewars.meeting;

import java.util.Arrays;
import java.util.stream.Collectors;

class Meeting {
    public static String meeting(String s) {
        return Arrays.stream(s.toUpperCase().split(";"))
                .map(p -> p.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
                .sorted()
                .collect(Collectors.joining());
    }
}