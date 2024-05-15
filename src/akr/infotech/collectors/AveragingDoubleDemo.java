package akr.infotech.collectors;

import akr.infotech.EmployeeRecord;
import akr.infotech.EmployeeRecordUtil;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AveragingDoubleDemo {
    public static void main(String[] args) {

      List<Integer> integers=List.of(11,33,22,55,44);

        Double num=integers.stream()
                .collect(Collectors.averagingInt(x->x.intValue()));

        System.out.println("Average  :: "+num);
    }
}
