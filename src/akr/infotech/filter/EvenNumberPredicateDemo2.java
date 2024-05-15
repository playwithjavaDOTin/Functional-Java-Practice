package akr.infotech.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EvenNumberPredicateDemo2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven=(x)->x%2==0;
        Predicate<Integer> isGreaterThanFive=(x)->x>5;

        numbers.stream()
                .filter(isEven) // call isEven Predicate
                .filter(isGreaterThanFive) //call isGreaterThanFive predicate
                .forEach(System.out::println); //Print filtered Number
    }
}
