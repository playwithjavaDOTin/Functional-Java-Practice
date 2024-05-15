package akr.infotech.sorting;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.List;
import java.util.stream.Collectors;

public class PeekMethodDemo {
    public static void main(String[] args) {
        List<EmployeeRecord> employeeRecord= EmployeeRecordUtil.getEmployeeRecord();

        List<String> sortedEmp=employeeRecord.stream()
                .filter(x->x.salary()>160000)
                .map(EmployeeRecord::name)
                .peek(x-> System.out.println("BEFORE : "+x))
                .map(z->z.toUpperCase())
                .peek(y-> System.out.println("AFTER : "+y))
                .collect(Collectors.toList());
    }
}
