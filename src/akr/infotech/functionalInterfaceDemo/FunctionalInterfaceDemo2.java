package akr.infotech.functionalInterfaceDemo;

import java.util.function.Function;

public class FunctionalInterfaceDemo2 {
    public static void main(String[] args) {

        Function<Integer,Boolean> isEven=(x)->x%2==0;
        Boolean i=isEven.apply(10);
        System.out.println("Is Even :: "+i);

    }
}
