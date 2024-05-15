package akr.infotech.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.IntStream;

public class MinMaxDemo {
    public static void main(String[] args) {

        List<Integer> nums=List.of(22,11,55,44,33,13);
       Optional<Integer> num= nums.stream()
                .max(Comparator.comparing(Function.identity()));
        System.out.println("MAX: "+num.get());

       /* using INtStream*/
        OptionalInt num1=IntStream.of(22,11,55,44,33,13)
                .max();
        System.out.println("MAX: "+num1.getAsInt());
    }
}
