package algorithm.examples;

public class StringMatcher {
    public static void main(String[] args) {
        String pattern = "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";
        String[] ipAddresses = {
                "000.12.12.034",
                "121.234.12.12",
                "23.45.12.56",
                "00.12.123.123123.123",
                "122.23",
                "Hello.IP"
        };

        for (String ip : ipAddresses)
            System.out.println(ip.matches(pattern));
    }
}