package akr.infotech.groupBy;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupByDemo5 {
    public static void main(String[] args) {

        List<EmployeeRecord> employeeRecordList =EmployeeRecordUtil.getEmployeeRecord();

        Map<String, Optional<EmployeeRecord>> result=employeeRecordList.stream()
                .collect(Collectors.groupingBy(EmployeeRecord::city,
                        Collectors.maxBy(Comparator.comparing(EmployeeRecord::salary))));

        System.out.println(result);
    }
}

