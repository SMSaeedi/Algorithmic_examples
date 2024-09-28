package algorithm.examples;

import java.util.*;

public class FindUniqueIntInList {
    public static int findUniqueInteger(int[] arr) {
        int unique = 0;
        for (int num : arr)
            unique ^= num;

        return unique;
    }

    public static int[] findUniqueIntegerArray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);

        List<Integer> uniqueList = new ArrayList<>();
        for (Integer num : arr)
            if (map.get(num) == 1)
                uniqueList.add(num);

        int[] result = new int[uniqueList.size()];
        int i = 0;
        for (Integer num : uniqueList)
            result[i++] = num;

        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2, 4, 1, 3, 2};
        System.out.println("The unique integer is: " + findUniqueInteger(arr));  // Output should be 1
        int[] arr1 = new int[]{4, 3, 2, 4, 1, 3, 2, 5, 7, 7, 9, 8, 11};
        System.out.println("The unique integers are: " + Arrays.toString(findUniqueIntegerArray(arr1)));  // Output should be 1
    }
}
