package codility.algorithm.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddsEvensTotalInArray {
    public static void main(String[] args) {
        Integer[] integers1 = {1, 2, 3, 4, 5};
        System.out.println(find_total(integers1));

        Integer[] integers2 = {17, 19, 21};
        System.out.println(find_total(integers2));

        Integer[] integers3 = {5, 5, 5};
        System.out.println(find_total(integers3));
    }

    public static Integer find_total(Integer[] my_numbers) {
        if (my_numbers.length == 0)
            return 0;

        Map<Boolean, List<Integer>> collect = Arrays.stream(my_numbers).collect(Collectors.partitioningBy(integer -> integer % 2 == 0));
        List<Integer> evens = collect.get(true);
        List<Integer> odds = collect.get(false);

        int evensSize = new ArrayList<>(evens).size();

        int odd5Size = (int) odds.stream().filter(integer -> integer.equals(5)).count();
        odd5Size *= 5;

        int oodsSize = (int) odds.stream().filter(integer -> !integer.equals(5)).count();
        oodsSize *= 3;

        return evensSize + oodsSize + odd5Size;
    }
}
