package akr.infotech.filter;

import akr.infotech.Employee;
import akr.infotech.EmployeeUtil;

import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployeeDemo2 {
    public static void main(String[] args) {

        /* Get the Employee List*/
        List<Employee> empList = EmployeeUtil.getEmployeeList();


       List<Employee> filterEmployees= empList.stream() //Create Stream
                .filter(x->x.getCity().equalsIgnoreCase("Bangalore"))
                 //Filter Employees WHERE CITY=Bangalore

                .collect(Collectors.toList());          // collect filtered Data to List

        filterEmployees.forEach(System.out::println);
    }
}
