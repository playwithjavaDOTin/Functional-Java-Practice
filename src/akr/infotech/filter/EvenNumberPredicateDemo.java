package akr.infotech.filter;

import java.util.Arrays;
import java.util.List;

public class EvenNumberPredicateDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(x->x%2==0) // Filter Even Numbers
                .forEach(System.out::println); //Print filtered Number
    }
}
