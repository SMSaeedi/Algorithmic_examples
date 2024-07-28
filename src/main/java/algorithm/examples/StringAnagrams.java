package algorithm.examples;

import java.util.Arrays;

public class StringAnagrams {
    static boolean isAnagram(String a, String b) {
        String normalized1 = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String normalized2 = b.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (normalized1.length() != normalized2.length())
            return false;

        char[] array1 = normalized1.toCharArray();
        char[] array2 = normalized2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagramm", "marganaa") ? "Anagrams" : "Not Anagrams");
        System.out.println(isAnagram("marganaa", "marganaa") ? "Anagrams" : "Not Anagrams");
    }
}
