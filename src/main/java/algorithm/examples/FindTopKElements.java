package algorithm.examples;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindTopKElements {
    public static void main(String[] args) {
        System.out.println(FindTopKElements.topKElementUsingTreeSet(List.of(1, 2, 3, 3, 4, 4, 5), 2));
        System.out.println(FindTopKElements.topKElementUsingStream(List.of(1, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 9), 3));
    }

    public static List<Integer> topKElementUsingTreeSet(List<Integer> list, int k) {
        Set<Integer> sortedSet = new TreeSet<>(Comparator.reverseOrder());
        sortedSet.addAll(list);
        return sortedSet.stream().limit(k).collect(Collectors.toList());
    }

    public static List<Integer> topKElementUsingStream(List<Integer> list, int k) {
        return list.stream().sorted(Comparator.reverseOrder()).distinct().limit(k).toList();
    }
}
