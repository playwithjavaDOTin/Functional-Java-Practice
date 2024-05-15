package akr.infotech.functionalInterfaceDemo;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {

        UnaryOperator<Integer> getSqr=(x)->x*x;

        Integer sqrOf10=getSqr.apply(10);
        System.out.println(sqrOf10);
    }
}
