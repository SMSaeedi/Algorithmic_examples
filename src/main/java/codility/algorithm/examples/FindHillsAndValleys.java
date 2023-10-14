package codility.algorithm.examples;

import java.util.Arrays;

public class FindHillsAndValleys {
    public static int hillsAndValleys(int[] arr) {
        int counter = 0;
        for (Integer i : arr) {
            if (i.equals(arr[0]))
                counter++;
        }
        if (counter == arr.length)
            return 0;

        var min = Arrays.stream(arr)
                .min()
                .getAsInt();
        var minCount = Arrays.stream(arr)
                .filter(i -> i == min)
                .count();

        var fMax = Arrays.stream(arr)
                .max()
                .getAsInt();
        var fMaxCount = Arrays.stream(arr)
                .filter(i -> i == fMax)
                .count();
        var sMaxCount = Arrays.stream(arr)
                .filter(value -> value == fMax - 1)
                .count();

        Long res = minCount + fMaxCount + sMaxCount;
        return res.intValue();

    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};
        System.out.print(hillsAndValleys(arr));

        int[] arr1 = {-3, -3};
        System.out.print(hillsAndValleys(arr1));
    }
}
