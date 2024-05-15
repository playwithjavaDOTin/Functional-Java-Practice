package akr.infotech.collectors;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<EmployeeRecord> employeeRecordList = EmployeeRecordUtil.getEmployeeRecord();

        String result=employeeRecordList.stream()
                .map(EmployeeRecord::name)
                .collect(Collectors.collectingAndThen(Collectors.joining(","),x->"___"+x));

        System.out.println("Result : "+result);
    }
}
