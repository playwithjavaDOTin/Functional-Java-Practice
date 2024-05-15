package akr.infotech.extra;

public interface PrivateMethodDemo {

    //default method
    default void myMethod() {
        int result = calculate();
        System.out.println("Result: " + result);
    }

    //Private method
    private int calculate() {
        return 42;
    }
}
