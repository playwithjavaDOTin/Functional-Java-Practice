package akr.infotech.sorting;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortDemo2 {
    public static void main(String[] args) {
        List<EmployeeRecord> employeeRecord= EmployeeRecordUtil.getEmployeeRecord();

        List<EmployeeRecord> sortedEmp=employeeRecord.stream()
                .sorted(Comparator.comparing(EmployeeRecord::name).reversed())
                .collect(Collectors.toList());

        System.out.println("############# Input DATA : Before Sorting ############");
        employeeRecord.forEach(System.out::println);

        System.out.println("############# Input DATA : After Sorting ############");
        sortedEmp.forEach(System.out::println);
    }
}
