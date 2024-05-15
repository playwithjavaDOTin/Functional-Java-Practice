package akr.infotech.extra;

import java.util.Arrays;
import java.util.List;

public class FindAvgListDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(11, 2, 3, 4, 5,9);
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Average: " + average);
    }
}
