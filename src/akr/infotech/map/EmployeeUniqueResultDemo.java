package akr.infotech.map;

import akr.infotech.Employee;
import akr.infotech.EmployeeUtil;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeUniqueResultDemo {
    public static void main(String[] args) {

        /* Get the Employee List*/
        List<Employee> empList = EmployeeUtil.getEmployeeList();

        List<Employee> employeeList=empList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("#################### Initial DATA ####################");
        empList.forEach(System.out::println);

        System.out.println("##################  RESULT DATA :: DISTINCT RESULT  ##################");
        employeeList.forEach(System.out::println);
    }
}
