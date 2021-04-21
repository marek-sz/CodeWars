package main.codewars.carboat;

import java.util.stream.IntStream;

public class Carboat {

    public static String howmuch(int m, int n) {

        int[] ints = IntStream.rangeClosed(Math.min(m, n), Math.max(m, n))
                .filter(c -> c % 9 == 1)
                .filter(b -> b % 7 == 2)
                .toArray();

        String concat = "";
        for (int anInt : ints) {
            int c = anInt / 9;
            int b = anInt / 7;
            concat += "[M: " + anInt + " B: " + b + " C: " + c + "]";
        }

        return "[" + concat + "]";
    }

    /*
    public static String howmuch(int m, int n) {
        List<String> solutions = IntStream.rangeClosed(Math.min(m, n), Math.max(m, n))
                .boxed()
                .filter(f -> f % 9 == 1 && f % 7 == 2)
                .map(f -> "[M: " + f + " B: " + f / 7 + " C: " + f / 9 + "]")
                .collect(toList());
        return   "[" +  String.join((""),solutions) + "]";

    }
    */
}