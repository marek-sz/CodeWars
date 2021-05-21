package main.coderbyte.desks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeskFinder {
    private static int counter = 0;

    public static int countDesks(int[] arr) {
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 1; i < arr[0]; i += 2) {
            if (!collect.contains(i)) {
                counter++;
            }
        }

        return counter;
    }
}
