package akr.infotech.groupBy;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo3 {
    public static void main(String[] args) {

        List<EmployeeRecord> employeeRecordList =EmployeeRecordUtil.getEmployeeRecord();

        Map<String,Map<String,List<EmployeeRecord>>> result=employeeRecordList.stream()
                .collect(Collectors.groupingBy(EmployeeRecord::city,
                        Collectors.groupingBy(EmployeeRecord::design)));

        System.out.println(result);
    }
}

