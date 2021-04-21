package main.codewars.statisticsforathletics;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StatisticsForAthleticAssociation {
    public static String stat(String strg) {
        List<LocalTime> list = new ArrayList<>();
        for (String s : strg.split(", ")) {
            String[] split = s.split("\\|");
            int hour = Integer.valueOf(split[0]);
            int minute = Integer.valueOf(split[1]);
            int second = Integer.valueOf(split[2]);
            list.add(LocalTime.of(hour, minute, second));
        }
        List<Integer> collect = list.stream().map(LocalTime::toSecondOfDay).sorted().collect(Collectors.toList());
        int range = collect.get(collect.size() - 1) - collect.get(0);
        double asDouble = collect.stream().mapToInt(Integer::intValue).average().getAsDouble();
        int median = collect.size() % 2 != 0
                ? collect.get(collect.size() / 2)
                : (collect.get(collect.size() / 2 - 1) + collect.get(collect.size() / 2)) / 2;

        return "Range: " + getFormattedTime(range) +
                " Average: " + getFormattedTime((int) asDouble) +
                " Median: " + getFormattedTime(median);
    }

    private static String getFormattedTime(int time) {
        return LocalTime.ofSecondOfDay(time).format(DateTimeFormatter.ISO_LOCAL_TIME).replace(":", "|");
    }
}
