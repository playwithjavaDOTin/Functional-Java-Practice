package akr.infotech.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample2 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("a", "b");
        List<String> list2 = Arrays.asList("c", "d");
        List<String> list3 = Arrays.asList("e", "f");
        List<List<String>> listOfList = Arrays.asList(list1, list2, list3);

        System.out.println("INPUT :"+listOfList);

        List<String> flatList = listOfList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Result : "+flatList);
    }
}
