package main.codewars.money;

public class Money {
    public static int calculateYears(double principal, double interest, double tax, double desired) {

        int time = 0;
        if (desired <= principal) {
            return 0;
        } else {
            while (principal < desired) {
                principal += (principal * interest) * (1 - tax);
                time++;
            }
        }

        return time;
    }
}