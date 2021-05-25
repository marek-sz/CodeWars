package main.coderbyte.stringreplacement;

public class StringReplacer {
    public static String convertString(String string) {
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        Character firstCharacter = string.charAt(0);

        if (string.length() == 1) {
            sb.append(counter).append(firstCharacter);
        }

        for (int i = 1; i < string.length(); i++) {
            Character currentCharacter = string.charAt(i);
            if (currentCharacter.equals(firstCharacter)) {
                counter++;
            } else {
                sb.append(counter).append(firstCharacter);
                counter = 1;
                firstCharacter = currentCharacter;
            }
            if (string.length() - 1 == i) {
                sb.append(counter).append(firstCharacter);
            }
        }
        return sb.toString();
    }
}