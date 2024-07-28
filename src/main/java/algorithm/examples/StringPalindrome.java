package algorithm.examples;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("string"));
    }

    private static String isPalindrome(String str) {
        String normalization = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse = new StringBuilder(normalization).reverse().toString();
        return reverse.equals(normalization) ? "Yes" : "No";
    }
}
