package akr.infotech.groupBy;


import akr.infotech.StudentRecord;
import akr.infotech.StudentRecordUtil;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByDemo14 {
    public static void main(String[] args) {

        List<StudentRecord> studentRecordList = StudentRecordUtil.getStudentList();

        TreeMap<String,TreeMap<String,List<StudentRecord>>> data=studentRecordList.stream()
                .collect(Collectors.groupingBy(StudentRecord::name,
                        TreeMap::new,
                        Collectors.groupingBy(StudentRecord::course,
                                TreeMap::new,
                                Collectors.mapping(Function.identity(),
                                        Collectors.toList()))));

        System.out.println(data);
    }
}

