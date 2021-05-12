package main.codewars.countingduplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        char[] chars = text.toLowerCase().toCharArray();
        List<Character> allChars = new ArrayList<>();
        Set<Character> duplicatedChars = new HashSet<>();

        for (char character : chars) {
            allChars.add(character);
        }

        for (int i = 0; i < allChars.size() - 1; i++) {
            for (int j = i + 1; j < allChars.size(); j++) {
                if (allChars.get(i).equals(allChars.get(j))
                        && !duplicatedChars.contains(allChars.get(i))) {
                    duplicatedChars.add(allChars.get(i));
                }
            }
        }

        return duplicatedChars.size();
    }
}