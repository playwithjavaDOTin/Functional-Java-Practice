package akr.infotech.stream;

import java.util.List;

public class StreamLimitDemo {
    public static void main(String[] args) {
        List<Integer> intList=List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("INPUT : "+intList);

        System.out.println("RESULT after LIMIT :");
        intList.stream().limit(5)
                .forEach(System.out::println);
    }
}
