package akr.infotech.groupBy;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo8 {
    public static void main(String[] args) {

        List<EmployeeRecord> employeeRecordList =EmployeeRecordUtil.getEmployeeRecord();

        Map<String, Double> result=employeeRecordList.stream()
                .collect(Collectors.groupingBy(EmployeeRecord::city,
                        Collectors.summingDouble(EmployeeRecord::salary)));

        System.out.println(result);
    }
}

