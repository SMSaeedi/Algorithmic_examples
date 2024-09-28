package algorithm.examples;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;

public class FindDay {
    private static final String[] days = {"SUNDAY", "MONDAY", "TUSEDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return days[dayOfWeek - 1];
    }

    public static String findDayUsingJavaTime(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(FindDay.findDay(6, 10, 2024));
        System.out.println(FindDay.findDayUsingJavaTime(4, 16, 1986));
        System.out.println(FindDay.findDayUsingJavaTime(4, 4, 1991));
    }

}