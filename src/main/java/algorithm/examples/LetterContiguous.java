package algorithm.examples;

public class LetterContiguous {

    public static void main(String[] args) {
        String str = "AB";
        if (isLetterContiguous(str.toCharArray()))
            System.out.println("Yes");
        else
            System.out.println("No");

        String str1 = "ABD";
        if (isLetterContiguous(str1.toCharArray()))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean isLetterContiguous(char[] s) {
        for (int i = 1; i < s.length; i++)
            if (s[i] - s[i - 1] != 1)
                return false;

        return true;
    }
}
