package akr.infotech.sealed;

public class TraineeImpl implements SealedTesterIntrface {

    @Override
    public int getAge() {
        return 25;
    }
    @Override
    public int getSalary() {
        return 333330;
    }
    @Override
    public String getTraineeName() {
        return "Raj";
    }
}
