package akr.infotech.methodRef;

public class MethodRefDemo2 {

    public static int m2(){
        System.out.println("#### Calling m2() method");
        return 11;
    }

    public static void main(String[] args) {

        MethodReferenceDemoService referenceDemoService= MethodRefDemo2::m2;

        Thread t=new Thread(()-> System.out.println("## Starting Thread..t1 "));
        t.start();

        Thread t2=new Thread(referenceDemoService::m1);
        t2.start();

        Thread t3=new Thread(MethodRefDemo2::m2);
        t3.start();
    }
}

