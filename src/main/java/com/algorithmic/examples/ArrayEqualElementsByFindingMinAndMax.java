package com.algorithmic.examples;

import java.util.Arrays;

public class ArrayEqualElementsByFindingMinAndMax {
    static int[] intArray = {3, 2, 1, 1, 2, 3, 1};
    static int[] intArray1 = {4, 1, 4, 1};
    static int[] intArray2 = {3, 3, 3};

    public static void main(String[] args) {
        System.out.println(minCost(intArray));
        System.out.println(minCost(intArray1));
        System.out.println(minCost(intArray2));
    }

    static int minCost(int arr[]) {
        int cost = 0;
        Arrays.sort(arr);
        int length = arr.length;

        int halfOfLength = arr[length / 2];

        for (int i = 0; i < length; ++i)
            cost += Math.abs(arr[i] - halfOfLength);

        if (length % 2 == 0) {
            int tempCost = 0;

            halfOfLength = arr[(length / 2) - 1];

            for (int i = 0; i < length; ++i)
                tempCost += Math.abs(arr[i] - halfOfLength);

            cost = Math.min(cost, tempCost);
        }

        return cost;
    }
}
