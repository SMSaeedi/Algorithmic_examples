package algorithm.examples;

import java.util.List;

public class FindUniqueIntInList {
    public static int findUniqueInteger(List<Integer> arr) {
        int unique = 0;
        for (int num : arr)
            unique ^= num;

        return unique;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(4, 3, 2, 4, 1, 3, 2);
        int uniqueInteger = findUniqueInteger(arr);
        System.out.println("The unique integer is: " + uniqueInteger);  // Output should be 1
    }
}
