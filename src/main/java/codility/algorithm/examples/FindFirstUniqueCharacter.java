package codility.algorithm.examples;

public class FindFirstUniqueCharacter {
    static String str = "efficient";
    static String str1 = "mahsa";
    static String str2 = "ssff";
    static String str3 = "";

    public static void main(String[] args) {
        System.out.println(findFirstUniqueCharacter(str));
        System.out.println(findFirstUniqueCharacter(str1));
        System.out.println(findFirstUniqueCharacter(str2));
        System.out.println(findFirstUniqueCharacter(str3));
    }

    private static Character findFirstUniqueCharacter(String input) {
        Character outPut;

        if (input.length() == 0)
            throw new RuntimeException("empty input!");

        for (Character ch : input.toCharArray())
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                outPut = ch;
                return outPut;
            }

        throw new RuntimeException("no pair char found!");
    }
}
