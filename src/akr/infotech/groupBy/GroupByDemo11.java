package akr.infotech.groupBy;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByDemo11 {
    public static void main(String[] args) {

        List<EmployeeRecord> employeeRecordList =EmployeeRecordUtil.getEmployeeRecord();

        /*Function to map data to required format*/
        Function<EmployeeRecord,EmployeePojo> mapData=(x)->{
            EmployeePojo p=new EmployeePojo(x.name(),x.design(),x.salary());
            return p;
        };

        TreeMap<String, List<EmployeePojo>> result=employeeRecordList.stream()
                .collect(Collectors.groupingBy(EmployeeRecord::city,
                        TreeMap::new,
                        Collectors.mapping(mapData::apply,Collectors.toList())));

        System.out.println(result);
    }
}

