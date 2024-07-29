package algorithm.examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMap {
    public static void main(String[] args) {
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Three", 30);
        unsortedMap.put("Four", 400);
        unsortedMap.put("Two", 12);
        unsortedMap.put("One", 1);

        var sortedMap = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        System.out.println(sortedMap);
    }
}
