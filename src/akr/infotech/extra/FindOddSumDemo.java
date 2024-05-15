package akr.infotech.extra;

import java.util.Arrays;
import java.util.List;

public class FindOddSumDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream()
                .filter(n -> n % 2 != 0) // Filter out odd numbers
                .mapToInt(n -> n * 2)     // Double odd numbers
                .sum();                   // Sum all numbers
        System.out.println("Sum of doubled odd numbers: " + sum);
    }
}
