package akr.infotech.map;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeUniqueResultDemo3 {
    public static void main(String[] args) {

        /* Get the Employee List*/
        List<EmployeeRecord> empList = EmployeeRecordUtil.getEmployeeRecord();

        Set<EmployeeRecord> employeeList=empList.stream()
                .collect(Collectors.toSet());

        System.out.println("#################### Initial DATA ####################");
        empList.forEach(System.out::println);

        System.out.println("##################  RESULT DATA :: DISTINCT RESULT  ##################");
        employeeList.forEach(System.out::println);
    }
}
