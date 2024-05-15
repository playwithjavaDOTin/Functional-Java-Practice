package akr.infotech.stream;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.Comparator;
import java.util.List;

public class MaxSalariedEmpDemo {
    public static void main(String[] args) {

        List<EmployeeRecord> employeeRecord =EmployeeRecordUtil.getEmployeeRecord();

       EmployeeRecord data= employeeRecord.stream()
                .max(Comparator.comparing(EmployeeRecord::salary))
                .get();

        System.out.println("################ Employee ist :: INPUT #############");
        employeeRecord.forEach(System.out::println);

        System.out.println("################## Employee with Highest SALARY : #################");
        System.out.println("Result :"+data);
    }
}
