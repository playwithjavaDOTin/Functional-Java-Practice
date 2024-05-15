package akr.infotech.groupBy;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo2 {
    public static void main(String[] args) {

        List<EmployeeRecord> employeeRecordList =EmployeeRecordUtil.getEmployeeRecord();

        Map<String,List<EmployeeRecord>> result=employeeRecordList.stream()
                .collect(Collectors.groupingBy(EmployeeRecord::city));

        System.out.println(result);
    }
}
