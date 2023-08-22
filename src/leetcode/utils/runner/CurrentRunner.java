package leetcode.utils.runner;


import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class CurrentRunner {
    public static void main(String[] args) {

    }

    // [-1,-8,0,5,-9]
    // -9 -8 -1 0 5
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < satisfaction.length; i++) {
            int sum = 0;
            int cook = 1;
            for (int j = i; j < satisfaction.length; j++) {
                sum += satisfaction[i] * cook;
                cook++;
            }
            max = Math.max(sum, max);
        }

        return max;

    }
}
