package akr.infotech.stream;
import akr.infotech.Employee;
import akr.infotech.EmployeeUtil;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeDemo {
    public static void main(String[] args) {

       List<Employee> employeeList= EmployeeUtil.getEmployeeList();

      /* Create Sequential Stream*/
        Stream<Employee> empStream =employeeList.stream();

        /*Using Lambda Expression*/
        empStream.forEach(x-> System.out.println(x));

      /*  Using Method Reference */
        //empStream.forEach(System.out::println);
    }
}
