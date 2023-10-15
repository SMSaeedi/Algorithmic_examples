package codility.algorithm.examples;

import java.util.Arrays;

public class FindHillsAndValleys {
    public static int hillsAndValleys(int[] arr) {
        var match = Arrays.stream(arr).allMatch(s -> s == (arr[0]));
        if (match)
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

        Long response = 0L;

        if (isArrayIncreasing(arr))
            return (int) minCount;
        if (isArrayDecreasing(arr))
            return (int) fMaxCount;

        var sMaxCount = Arrays.stream(arr)
                .filter(value -> value == fMax - 1)
                .count();
        response = minCount + fMaxCount + sMaxCount;

        return response.intValue();

    }

    static boolean isArrayIncreasing(int[] array) {
        boolean result = true;
        int i;
        for (i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    static boolean isArrayDecreasing(int[] array) {
        boolean result = true;
        int i;
        for (i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5, 1, 1, 6};
        System.out.print(hillsAndValleys(arr));

        int[] arr1 = {-3, -3};
        System.out.print(hillsAndValleys(arr1));

        int[] arr2 = {1, 2, 3};
        System.out.print(hillsAndValleys(arr2));

        int[] arr3 = {3, 2, 1};
        System.out.print(hillsAndValleys(arr3));
    }
}
