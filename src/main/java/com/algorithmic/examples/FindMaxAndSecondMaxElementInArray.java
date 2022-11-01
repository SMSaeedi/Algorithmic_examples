package com.algorithmic.examples;

import org.apache.commons.lang3.ArrayUtils;

public class FindMaxAndSecondMaxElementInArray {
    public static int findMaxElementInArray(int arr[]) {
        if (arr.length == 0)
            throw new RuntimeException("array is empty");

        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static int findSecondMaxElementInArray(int arr[]) {
        if (arr.length == 0)
            throw new RuntimeException("array is empty");

        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }

        int[] newArray = ArrayUtils.remove(arr, maxIndex);
        int newArrayMax = newArray[0];
        for (int i = 0; i < newArray.length; i++)
            if (newArray[i] > newArrayMax)
                newArrayMax = newArray[i];

        return newArrayMax;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 9, 8, 7, 6, 5};
        System.out.println(findMaxElementInArray(arr));

        int arr1[] = {1, 3, 20, 4, 18, 0, 19};
        System.out.println(findSecondMaxElementInArray(arr1));
    }
}
