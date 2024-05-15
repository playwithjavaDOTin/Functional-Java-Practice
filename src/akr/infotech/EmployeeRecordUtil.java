package akr.infotech;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRecordUtil {
    public static List<EmployeeRecord> getEmployeeRecord(){
        EmployeeRecord e1=new EmployeeRecord("Raj","Bangalore","SE", 210000.0);
        EmployeeRecord e2=new EmployeeRecord("Mahesh","Bangalore","SSE", 120000.0);
        EmployeeRecord e3=new EmployeeRecord("Swetha","Bangalore","HR", 130000.0);
        EmployeeRecord e4=new EmployeeRecord("Rani","Bangalore","HR", 150000.0);

        EmployeeRecord e5=new EmployeeRecord("Heera","Patna","SE", 110000.0);
        EmployeeRecord e6=new EmployeeRecord("Ramesh","Patna","SSE", 170000.0);
        EmployeeRecord e7=new EmployeeRecord("Manik","Delhi","SE", 190000.0);

        List<EmployeeRecord> employeeList=new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);
        return employeeList;
    }
}
