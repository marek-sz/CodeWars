package main.codewars.helpyourgranny;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Tour {
    public static int tour(String[] friends, String[][] friendsLocations, Map<String, Double> distanceMap) {
        Map<String, String> visitingOrder = new TreeMap<>();
        for (int i = 0; i < (Math.min(friends.length, friendsLocations.length)); i++) {
            visitingOrder.put(friends[i], findCorrespondingValue(friendsLocations, friends[i]));
        }
        return calculateTotalDistance(visitingOrder, distanceMap);
    }

    private static int calculateTotalDistance(Map<String, String> visitingOrder,
                                              Map<String, Double> distanceMap) {
        double distance = 0;
        if (!distanceMap.isEmpty() && distanceMap.size() > 1) {
            double firstCatheus;
            double hypotenuse;
            List<Double> list = new ArrayList<>();
            for (String town : visitingOrder.values()) {
                list.add(distanceMap.get(town));
            }
            distance = list.get(0) + list.get(list.size() - 1);
            for (int i = 0; i < list.size() - 1; i++) {
                firstCatheus = list.get(i);
                hypotenuse = list.get(i + 1);
                distance += calculateSecondCatheus(firstCatheus, hypotenuse);
            }
        }
        return (int) distance;
    }

    public static String findCorrespondingValue(String[][] ftwns, String key) {
        for (String[] ftwn : ftwns) {
            if (ftwn[0].equals(key)) {
                return ftwn[1];
            }
        }
        return null;
    }

    public static double calculateSecondCatheus(double firstCatheus, double hypotenuse) {
        return Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(firstCatheus, 2));
    }
}