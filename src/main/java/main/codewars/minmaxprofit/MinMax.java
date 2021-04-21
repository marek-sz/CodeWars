package main.codewars.minmaxprofit;

class MinMax {
    public static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i <= min) {
                min = i;
            } else {
                if (i >= max) {
                    max = i;
                }
            }
        }
        return new int[]{min, max};
    }
}