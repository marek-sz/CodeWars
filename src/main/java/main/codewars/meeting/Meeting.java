package main.codewars.meeting;

import java.util.ArrayList;
import java.util.List;

class Meeting {

    public static String meeting(String s) {
        String[] split = s.split(";");

        List<Object> objects = new ArrayList<>();

        for (String s1 : split) {
            String[] split2 = new String[2];
            String[] split1 = s1.split(":");
            split2[0] = split1[1];
            split2[1] = split1[0];
            objects.add(split2);
        }

        objects.stream()
                .sorted()
                .forEach(System.out::println);

        return s;
    }
}

/*
John has invited some friends. His list is:

s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";

Could you make a program that

    makes this string uppercase
    gives it sorted in alphabetical order by last name.

When the last names are the same, sort them by first name. Last name and first name of a guest come in the result between parentheses separated by a comma.

So the result of function meeting(s) will be:

"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"

It can happen that in two distinct families with the same family name two people have the same first name too.
Notes

    You can see another examples in the "Sample tests".

*/