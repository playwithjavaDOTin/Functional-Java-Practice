package akr.infotech.filter;

import akr.infotech.Employee;
import akr.infotech.EmployeeUtil;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterEmployeeDemo3 {
    public static void main(String[] args) {

        /* Get the Employee List*/
        List<Employee> empList = EmployeeUtil.getEmployeeList();

        //Filter Employees WHERE CITY=Bangalore
        Predicate<Employee> cityPredicate=(x)->x.getCity().equalsIgnoreCase("Bangalore");

       List<Employee> filterEmployees= empList.stream() //Create Stream
                .filter(cityPredicate::test)  //call cityPredicate Predicate

                .collect(Collectors.toList());

        filterEmployees.forEach(System.out::println);
    }
}
