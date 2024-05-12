package codility.algorithm.examples;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FindTopKElements {
    public static void main(String[] args) {
        System.out.println(FindTopKElements.findTopKElementUsingHeapOrderedTreeSet(List.of(1, 2, 3, 3, 4, 4, 5), 2));
    }

    public static List<Integer> findTopKElementUsingHeapOrderedTreeSet(List<Integer> lst, int k) {
        Set<Integer> sortedSet = new TreeSet<>(Comparator.reverseOrder());
        sortedSet.addAll(lst);
        return sortedSet.stream().limit(k).collect(Collectors.toList());
    }
}
