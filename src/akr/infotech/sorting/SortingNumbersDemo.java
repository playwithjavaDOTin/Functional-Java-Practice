package akr.infotech.sorting;

import java.util.List;
import java.util.stream.Collectors;

public class SortingNumbersDemo {
    public static void main(String[] args) {

        List<Integer> intList= List.of(11,44,66,12,66,99,33);

        List<Integer> sortedNums=intList.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Input: "+intList);
        System.out.println("Sorted Result: "+sortedNums);

    }
}
