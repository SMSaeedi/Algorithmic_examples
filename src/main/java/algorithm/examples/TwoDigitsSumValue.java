package algorithm.examples;

public class TwoDigitsSumValue {
    private static final Integer[] intArray = {1, 1000, 80, -91};
    private static Integer sum = 0;

    public static void main(String[] args) {
        System.out.println("intArray two digits sum value is: " + solution(intArray));
    }

    public static Integer solution(Integer[] inputArray) {
        for (Integer i : inputArray)
            if (Math.abs(i) > 9 && Math.abs(i) < 100)
                sum += i;

        return sum;
    }
}
