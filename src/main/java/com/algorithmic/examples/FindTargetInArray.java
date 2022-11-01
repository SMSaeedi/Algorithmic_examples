package com.algorithmic.examples;

public class FindTargetInArray {
    static int[] intArray = {1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        boolean s = solution(intArray, 14);
        System.out.println("result : " + s);
    }

    private static boolean solution(int[] intArray, int target) {
        int n = intArray.length;
        for (int i = 0; i < n - 1; i++)
            if (intArray[i] + 1 < intArray[i + 1])
                return false;

        return intArray[0] == 1 && intArray[n - 1] == target;
    }
}
