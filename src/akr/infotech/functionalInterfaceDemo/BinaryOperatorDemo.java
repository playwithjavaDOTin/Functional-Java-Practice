package akr.infotech.functionalInterfaceDemo;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {

        BinaryOperator<Integer> getSum=(x,y)->(x+y);

        Integer sumOfTwoNumbers=getSum.apply(11,22);
        System.out.println(sumOfTwoNumbers);
    }
}
