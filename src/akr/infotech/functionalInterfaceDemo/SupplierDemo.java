package akr.infotech.functionalInterfaceDemo;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<Double> getSomeNumber=()->{
            Double num= Math.random()*1000%10;
            return num;
        };
        Double number=getSomeNumber.get();
        System.out.println("Number "+number);
    }
}
