package akr.infotech.extra;

import java.util.Arrays;
import java.util.List;

public class FindMaxNumDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 8, 3, 6, 5);
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);

        System.out.println("Maximum: " + max);
    }
}
