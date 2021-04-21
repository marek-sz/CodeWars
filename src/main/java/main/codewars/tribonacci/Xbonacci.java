package main.codewars.tribonacci;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {

        double[] list = new double[n];
        for (int i = 0; i < n; i++) {
            if (i < 3) {
                list[i] = s[i];
            } else {
                list[i] = list[i - 1] + list[i - 2] + list[i - 3];
            }
        }
        return list;
    }
}
