package akr.infotech.stream;

import java.util.stream.Stream;

public class CreateStreamDemo {
    public static void main(String[] args) {

        Stream.Builder<String> builder = Stream.builder();
        Stream<String> streamBuilt = builder
                .add("a")
                .add("b")
                .add("c")
                .build();

      /*  Print the Stream*/
        streamBuilt
                .forEach(System.out::println);
    }
}
