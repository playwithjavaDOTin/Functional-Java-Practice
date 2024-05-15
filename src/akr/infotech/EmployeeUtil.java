package akr.infotech;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
    public static List<Employee> getEmployeeList(){
        Employee e1=new Employee("Raj","Bangalore","SE", 210000.0);
        Employee e2=new Employee("Mahesh","Bangalore","SSE", 120000.0);
        Employee e3=new Employee("Swetha","Bangalore","HR", 130000.0);
        Employee e4=new Employee("Rani","Bangalore","HR", 150000.0);

        Employee e5=new Employee("Heera","Patna","SE", 110000.0);
        Employee e6=new Employee("Ramesh","Patna","SSE", 170000.0);
        Employee e9=new Employee("Ramesh","Patna","SSE", 170000.0);

        Employee e7=new Employee("Manik","Delhi","SE", 190000.0);
        Employee e8=new Employee("Manik","Delhi","SE", 190000.0);


        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e9);
        employeeList.add(e7);

        employeeList.add(e8);


        return employeeList;
    }
}
