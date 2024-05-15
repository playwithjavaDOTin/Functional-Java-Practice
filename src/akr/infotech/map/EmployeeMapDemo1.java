package akr.infotech.map;

import akr.infotech.Employee;
import akr.infotech.EmployeeUtil;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMapDemo1 {
    public static void main(String[] args) {

        /* Get the Employee List*/
        List<Employee> empList = EmployeeUtil.getEmployeeList();

        List<String> filteredEmpNames=empList.stream()
                .filter(x->x.getSalary()>160000) // Filter Employee's WHERE Salary>160,000
                .map(Employee::getName) // map SALARY using Method Reference
                .collect(Collectors.toList()); //collect Result to a List

        // Print Employee Names
        filteredEmpNames.forEach(System.out::println);
    }
}
