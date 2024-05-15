package akr.infotech.stream;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.Comparator;
import java.util.List;

public class MinSalariedEmpDemo {
    public static void main(String[] args) {

        List<EmployeeRecord> employeeRecord =EmployeeRecordUtil.getEmployeeRecord();

       Double data= employeeRecord.stream()
                .filter(x->x.city().equalsIgnoreCase("Bangalore"))
                .min(Comparator.comparing(EmployeeRecord::salary))
                .map(EmployeeRecord::salary)
                .get();

        System.out.println("################ Employee ist :: INPUT #############");
        employeeRecord.forEach(System.out::println);

        System.out.println("################## Employee with Highest SALARY : #################");
        System.out.println("Result :"+data);
    }
}
