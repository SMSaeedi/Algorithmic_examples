package algorithm.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokens {
    public static void main(String[] args) {
        String str = "He is a very very good boy, isn't he?";
        String regex = "[a-zA-Z]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        List<String> tokens = new ArrayList<>();

        while (matcher.find())
            tokens.add(matcher.group());

        System.out.println(tokens.size());

        for (String token : tokens)
            System.out.println(token);
    }
}
