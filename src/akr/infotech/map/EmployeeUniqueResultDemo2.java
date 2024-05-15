package akr.infotech.map;

import akr.infotech.Employee;
import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;
import akr.infotech.EmployeeUtil;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeUniqueResultDemo2 {
    public static void main(String[] args) {

        /* Get the Employee List*/
        List<EmployeeRecord> empList = EmployeeRecordUtil.getEmployeeRecord();

        List<EmployeeRecord> employeeList=empList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("#################### Initial DATA ####################");
        empList.forEach(System.out::println);

        System.out.println("##################  RESULT DATA :: DISTINCT RESULT  ##################");
        employeeList.forEach(System.out::println);
    }
}
