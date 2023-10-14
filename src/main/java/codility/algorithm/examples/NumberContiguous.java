package codility.algorithm.examples;
import java.util.List;

public class NumberContiguous {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        if (isNumberContiguous(numbers))
            System.out.println("Yes");
        else
            System.out.println("No");

        List<Integer> numbers1 = List.of(1, 3, 4, 5, 6);
        if (isNumberContiguous(numbers1))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean isNumberContiguous(List<Integer> numbers) {
        int start = 1;
        for (Integer i : numbers)
            if (i != start + i)
                return false;

        return true;
    }

}
