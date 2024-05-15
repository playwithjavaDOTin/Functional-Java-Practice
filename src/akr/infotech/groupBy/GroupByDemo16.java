package akr.infotech.groupBy;


import akr.infotech.StudentRecord;
import akr.infotech.StudentRecordUtil;

import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class GroupByDemo16 {
    public static void main(String[] args) {

        List<StudentRecord> studentRecordList = StudentRecordUtil.getStudentList();

        var data=studentRecordList.stream()
                .collect(Collectors.groupingBy(StudentRecord::name,
                        Collectors.averagingDouble(StudentRecord::marks)));

        System.out.println(data);
    }
}

