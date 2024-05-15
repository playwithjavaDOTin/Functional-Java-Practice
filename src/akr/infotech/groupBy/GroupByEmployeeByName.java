package akr.infotech.groupBy;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.List;
import java.util.stream.Collectors;

public class GroupByEmployeeByName {
    public static void main(String[] args) {

        List<EmployeeRecord> employeeRecordList =EmployeeRecordUtil.getEmployeeRecord();

        List<String> employeeName=employeeRecordList.stream()
                .collect(Collectors.mapping(EmployeeRecord::name,Collectors.toList()));

        System.out.println("employeeName :: "+employeeName);
    }
}
