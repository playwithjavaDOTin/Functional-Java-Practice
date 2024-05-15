package akr.infotech.sealed;

public sealed interface OrgService  permits EmployeeService,TraineeService,SealedTesterIntrface {
    int getAge();
    int getSalary();
}
