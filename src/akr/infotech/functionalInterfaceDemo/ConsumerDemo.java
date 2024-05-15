package akr.infotech.functionalInterfaceDemo;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args)throws Exception {
        Consumer<Integer> printConsume=(x)-> System.out.println("You have provided: "+x);
        printConsume.accept(10);
    }

}
