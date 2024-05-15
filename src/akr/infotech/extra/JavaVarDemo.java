package akr.infotech.extra;



import java.util.List;
import java.util.stream.Collectors;

public class JavaVarDemo {
    public static void main(String[] args) {

        var message = "Hello, world!";
        System.out.println(message);

        var num1=10;
        var num2=20;
        var sum=num1+num2;
        System.out.println("SUM ::"+sum);

        var list=List.of(11,33,12,44,32);
        var sortedList=list.stream()
                .sorted()
                        .collect(Collectors.toList());
        System.out.println("MAX :: "+sortedList);
    }
}



