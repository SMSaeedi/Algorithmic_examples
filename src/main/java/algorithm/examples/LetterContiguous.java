package algorithm.examples;

public class LetterContiguous {

    public static void main(String[] args) {
        String str = "AB";
        System.out.println(isLetterContiguous(str.toCharArray()) ? "Yes" : "No");

        String str1 = "ABD";
        System.out.println(isLetterContiguous(str1.toCharArray()) ? "Yes" : "No");

        String str2 = "ABC";
        System.out.println(isLetterContiguous(str2.toCharArray()) ? "Yes" : "No");
    }

    private static boolean isLetterContiguous(char[] s) {
        for (int i = 1; i < s.length; i++)
            if (s[i] - s[i - 1] != 1)
                return false;

        return true;
    }
}
