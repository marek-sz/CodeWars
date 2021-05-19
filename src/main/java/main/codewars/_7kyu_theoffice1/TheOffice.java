package main.codewars._7kyu_theoffice1;

import java.util.Arrays;

public class TheOffice {
    private static final String GOOD_JOB = "Nice Work Champ!";
    private static final String BAD_JOB = "Get Out Now!";

    public static String outed(Person[] meet, String boss) {
        double averageHappiness = Arrays.stream(meet)
                .mapToInt(p -> p.name.equals(boss) ? p.happiness * 2 : p.happiness)
                .average()
                .orElse(0.0);
        return averageHappiness <= 5 ? BAD_JOB : GOOD_JOB;
    }
}
