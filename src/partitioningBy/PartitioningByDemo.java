package partitioningBy;


import akr.infotech.StudentRecord;
import akr.infotech.StudentRecordUtil;
import java.util.List;
import java.util.stream.Collectors;

public class PartitioningByDemo {
    public static void main(String[] args) {

        List<StudentRecord> data =StudentRecordUtil.getStudentList();
        System.out.println("###################### INPUT DATA #####################");
        System.out.println(data);

        var partitionedData =data.stream()
                .collect(Collectors.partitioningBy(y->y.marks()>80));

        System.out.println("############## Result : Score>80 ###########");
        System.out.println(partitionedData.get(Boolean.TRUE));

    }
}
