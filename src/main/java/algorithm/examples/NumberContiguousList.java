package algorithm.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NumberContiguousList {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 5, 3, 4, 2);
        System.out.println(isNumberContiguous(numbers) ? "Yes" : "No");

        List<Integer> numbers1 = List.of(1, 3, 5, 4, 6);
        System.out.println(isNumberContiguous(numbers1) ? "Yes" : "No");
    }

    private static boolean isNumberContiguous(List<Integer> numbers) {
        if (numbers.isEmpty())
            return false;

        var sortedList = numbers.stream().sorted(Comparator.naturalOrder()).toList();

        for (int i = 1; i < sortedList.size() - 1; i++)
            if (sortedList.get(i) - sortedList.get(i - 1) != 1)
                return false;

        return true;
    }

}

class NumberContiguousArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 6, 3, 8, 1, 9, 11, 12};
        System.out.println(isNumberContinueSequentially(arr1));
        int[] arr2 = {2, 6, 3, 8, 1, 7, 4, 5};
        System.out.println(isNumberContinueSequentially(arr2));
    }

    private static boolean isNumberContinueSequentially(int[] arr1) {
        if (arr1 == null || arr1.length == 0)
            return false;

        Arrays.sort(arr1);

        for (int i = 1; i < arr1.length - 1; i++)
            if (arr1[i] - arr1[i - 1] != 1)
                return false;

        return true;
    }
}
