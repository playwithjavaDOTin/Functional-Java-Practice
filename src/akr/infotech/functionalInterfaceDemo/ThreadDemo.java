package akr.infotech.functionalInterfaceDemo;

public class ThreadDemo {
    public static void main(String[] args) {

            Runnable r=()-> System.out.println("Thread is Running ...");
            //OR
            Thread t=new Thread(()-> System.out.println("Thread is Running ..."));

        r.run();
    }
}
