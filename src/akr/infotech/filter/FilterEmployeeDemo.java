package akr.infotech.filter;

import akr.infotech.Employee;
import akr.infotech.EmployeeUtil;

import java.util.List;
import java.util.stream.Collectors;

public class FilterEmployeeDemo {
    public static void main(String[] args) {

        /* Get the Employee List*/
        List<Employee> empList = EmployeeUtil.getEmployeeList();

       List<Employee> filterEmployees= empList.stream() //Create Stream
                .filter(x->x.getSalary()>160000)        //Filter Employees WHERE Salary >160,000
                .collect(Collectors.toList());          // collect filtered Data to List

        filterEmployees.forEach(System.out::println);

    }
}
