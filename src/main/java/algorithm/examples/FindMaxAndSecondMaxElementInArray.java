package algorithm.examples;


import java.util.Arrays;
import java.util.Comparator;

public class FindMaxAndSecondMaxElementInArray {
    public static int findMaxElementInArray(int[] arr) {
        if (arr.length == 0)
            throw new RuntimeException("array is empty");

//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++)
//            if (arr[i] > max)
//                max = arr[i];

        return Arrays.stream(arr).max().getAsInt();
    }

    public static int findSecondMaxElementInArray(int[] arr) {
        if (arr.length == 0)
            throw new RuntimeException("array is empty");

//        int max = arr[0];
//        int maxIndex = 0;
//        for (int i = 0; i < arr.length; i++)
//            if (arr[i] > max) {
//                max = arr[i];
//                maxIndex = i;
//            }

//        int[] newArray = ArrayUtils.remove(arr, maxIndex);
//        int newArrayMax = newArray[0];
//        for (int j : newArray)
//            if (j > newArrayMax)
//                newArrayMax = j;


        return Arrays.stream(arr)
                .boxed()                            // Convert int to Integer
                .sorted(Comparator.reverseOrder())  // Sort in descending order
                .distinct()                         // Remove duplicates
                .skip(1)                         // Skip the first element (max value)
                .findFirst()                        // Get the first element (second max value)
                .orElseThrow(() -> new IllegalArgumentException("Array must contain at least two unique values"));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 9, 8, 7, 6, 5};
        System.out.println(findMaxElementInArray(arr));

        int[] arr1 = {1, 3, 20, 4, 18, 0, 19};
        System.out.println(findSecondMaxElementInArray(arr1));
    }
}
