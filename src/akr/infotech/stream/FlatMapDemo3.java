package akr.infotech.stream;

import akr.infotech.Employee;
import akr.infotech.EmployeeRecord;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo3 {
    public static void main(String[] args) {

        List<EmployeeRecord> devTeam=List.of(
                new EmployeeRecord("Manik","Delhi","SE", 190000.0),
                new EmployeeRecord("Raj","Delhi","SSE", 120000.0));

        List<EmployeeRecord> qaTeam=List.of(
                new EmployeeRecord("Heera","Delhi","SE", 130000.0),
                new EmployeeRecord("Jassi","UK","SE", 150000.0));

        List<EmployeeRecord> devOpsTeam=List.of(
                new EmployeeRecord("Mina","Panjab","SE", 170000.0),
                new EmployeeRecord("Kalma","UAE","SE", 180000.0));

        List<List<EmployeeRecord>> orgTeam=List.of(devTeam,qaTeam,devOpsTeam);

        List<EmployeeRecord> totalEmployee= orgTeam.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        totalEmployee.forEach(System.out::println);
    }
}
