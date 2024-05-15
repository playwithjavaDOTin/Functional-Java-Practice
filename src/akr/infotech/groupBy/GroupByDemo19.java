package akr.infotech.groupBy;


import akr.infotech.StudentRecord;
import akr.infotech.StudentRecordUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByDemo19 {
    public static void main(String[] args) {

        List<StudentRecord> studentRecordList = StudentRecordUtil.getStudentList();

        var data = studentRecordList.stream()
                .collect(Collectors.groupingByConcurrent(StudentRecord::name,
                        Collectors.groupingByConcurrent(StudentRecord::course)));

        System.out.println(data);
    }
}

