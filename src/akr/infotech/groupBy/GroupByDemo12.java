package akr.infotech.groupBy;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByDemo12 {
    public static void main(String[] args) {

        List<EmployeeRecord> employeeRecordList =EmployeeRecordUtil.getEmployeeRecord();


        TreeMap<String,Map<String,List<EmployeeRecord>>> data =employeeRecordList.stream()
                .collect(Collectors.groupingBy(EmployeeRecord::city,TreeMap::new,
                        Collectors.groupingBy(EmployeeRecord::design,
                                Collectors.mapping(Function.identity(),Collectors.toList()))));

       System.out.println(data);
    }
}

