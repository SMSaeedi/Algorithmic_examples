package com.algorithmic.examples;

public class MountainArray {
    static Boolean isMountainArray(int[] arr) {
        if (arr.length == 0)
            throw new RuntimeException("array is empty");

        int i = 0;
        for (i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                break;

        if (i == arr.length || i == 1)
            return false;

        //should continue from the last 'i' value, so 'i' does not have any initial value.
        for (; i < arr.length; i++)
            if (arr[i] > arr[i - 1])
                return false;

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 9, 8, 7, 6, 5};
        System.out.println(isMountainArray(arr) ? "true" : "false");
    }
}
