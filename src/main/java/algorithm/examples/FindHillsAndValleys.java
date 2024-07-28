package algorithm.examples;

import java.util.Arrays;

public class FindHillsAndValleys {
    public static int hillsAndValleys(int[] arr) {
        /**
         * .allMatch() checks whether all elements of the stream match a given predicate.
         * It returns a boolean value.
         */
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

        long response = 0;

        if (isArrayIncreasing(arr))
            return (int) minCount;
        if (isArrayDecreasing(arr))
            return (int) fMaxCount;

        var sMaxCount = Arrays.stream(arr)
                .filter(value -> value == fMax - 1)
                .count();
        response = minCount + fMaxCount + sMaxCount;

        return (int) response;

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
        System.out.println(isArrayIncreasing(arr) ? "Max value: " + hillsAndValleys(arr) :
                (isArrayDecreasing(arr) ? "Min value: " + hillsAndValleys(arr) :
                        " Flat or Mountain Array " + hillsAndValleys(arr)));

        int[] arr1 = {-3, -3};
        System.out.println(isArrayIncreasing(arr1) ? "Max value: " + hillsAndValleys(arr1) :
                (isArrayDecreasing(arr1) ? "Min value: " + hillsAndValleys(arr1) :
                        " Flat or Mountain Array " + hillsAndValleys(arr1)));

        int[] arr2 = {1, 2, 3};
        System.out.println(isArrayIncreasing(arr2) ? "Max value: " + hillsAndValleys(arr2) :
                (isArrayDecreasing(arr2) ? "Min value: " + hillsAndValleys(arr2) :
                        " Flat or Mountain Array " + hillsAndValleys(arr2)));

        int[] arr3 = {3, 2, 1};
        System.out.println(isArrayIncreasing(arr3) ? "Max value: " + hillsAndValleys(arr3) :
                (isArrayDecreasing(arr3) ? "Min value: " + hillsAndValleys(arr3) :
                        " Flat or Mountain Array" + hillsAndValleys(arr3)));
    }
}
