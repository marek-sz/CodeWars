package main.codewars.ballupwards;

public class BallUpwards {
    public static int maxBall(int v0) {
        double previousHeight = Integer.MIN_VALUE;
        double currentHeight;
        for (int t = 0; t < 100; t++) {
            currentHeight = calculateHeight(v0, t);
            if (previousHeight < currentHeight) {
                previousHeight = currentHeight;
            } else {
                return t - 1;
            }
        }
        return 0;
    }

    private static double calculateHeight(int v0, int t) {
        double v0inMetersPerSecond = v0 / 3.6;
        double tenthOfASecond = (double) t / 10;
        return v0inMetersPerSecond * tenthOfASecond - 0.5 * 9.81 * Math.pow(tenthOfASecond, 2);
    }
}
