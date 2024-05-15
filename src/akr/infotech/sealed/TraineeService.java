package akr.infotech.sealed;

public sealed interface TraineeService extends OrgService permits SealedTesterIntrface{
    String getTraineeName();
}

