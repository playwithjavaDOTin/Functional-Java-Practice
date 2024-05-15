package akr.infotech.map;

import akr.infotech.Employee;
import akr.infotech.EmployeeUtil;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeMapDemo2 {
    public static void main(String[] args) {

        /* Get the Employee List*/
        List<Employee> empList = EmployeeUtil.getEmployeeList();

        Function<Employee,String> mapEmpployeeObjectToName=(x)->x.getName();

        List<String> filteredEmpNames=empList.stream()
                .map(mapEmpployeeObjectToName)
                .collect(Collectors.toList());

        System.out.println("##################### Input Data ##################### ");
        empList.forEach(System.out::println);

        System.out.println("##################### Result Data after Mapping  ##################### ");
        filteredEmpNames.forEach(System.out::println);
    }
}
