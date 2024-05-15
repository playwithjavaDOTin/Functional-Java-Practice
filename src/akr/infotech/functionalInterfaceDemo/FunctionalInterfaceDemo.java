package akr.infotech.functionalInterfaceDemo;

import java.util.function.Function;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> multiplyNumByTwo=(x)->x*2;
        Integer i=multiplyNumByTwo.apply(10);
        System.out.println("NUM: "+i);

    }
}
