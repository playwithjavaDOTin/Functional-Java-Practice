package akr.infotech.extra;

public interface DefaultMethodDemo {

    default void m1() {
        // Default implementation
        System.out.println("#####  you are calling method m1()");
    }

    default void m2() {
        // Default implementation
        System.out.println("#####  you are calling method m2()");
    }
}
