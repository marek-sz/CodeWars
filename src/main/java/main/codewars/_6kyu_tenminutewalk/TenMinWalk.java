package main.codewars._6kyu_tenminutewalk;

public class TenMinWalk {
    public static boolean isValid(char[] directions) {
        if (directions.length != 10) {
            return false;
        }
        int x = 0, y = 0;
        for (char direction : directions) {
            switch (direction) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'e':
                    x++;
                    break;
                case 'w':
                    x--;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}