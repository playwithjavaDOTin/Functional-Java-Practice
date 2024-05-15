package akr.infotech.groupBy;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo9 {
    public static void main(String[] args) {

        List<EmployeeRecord> employeeRecordList =EmployeeRecordUtil.getEmployeeRecord();

        Map<String, DoubleSummaryStatistics> result=employeeRecordList.stream()
                .collect(Collectors.groupingBy(EmployeeRecord::city,
                        Collectors.summarizingDouble(EmployeeRecord::salary)));

        System.out.println(result);
    }
}

