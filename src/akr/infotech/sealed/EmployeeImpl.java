package akr.infotech.sealed;

public class EmployeeImpl implements EmployeeService{

    @Override
    public String getEmployeeName() {
        return "Amit";
    }

    @Override
    public int getAge() {
        return 28;
    }

    @Override
    public int getSalary() {
        return 331110;
    }
}
