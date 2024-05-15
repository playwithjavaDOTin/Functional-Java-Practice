package akr.infotech.sorting;

import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo {
    public static void main(String[] args) {

        List<String> strList= List.of("Raj","Vikash","Amit","Yana","Heera");

        List<String> sortedNames=strList.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Input: "+strList);
        System.out.println("Sorted Result: "+sortedNames);

    }
}
