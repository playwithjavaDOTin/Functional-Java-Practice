package akr.infotech.map;

import java.util.List;
import java.util.stream.Collectors;

public class UniqueResultDemo {
    public static void main(String[] args) {

        List<String> names= List.of("Raj","Mahesh","Sona","Raj","Mahesh","Shera");
        System.out.println("#######  Input Data with duplicate entry  #######");
        System.out.println(names);

        List<String> distinctNames=names.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("######## Result with distinct Names::");
        System.out.println(distinctNames);
    }
}
