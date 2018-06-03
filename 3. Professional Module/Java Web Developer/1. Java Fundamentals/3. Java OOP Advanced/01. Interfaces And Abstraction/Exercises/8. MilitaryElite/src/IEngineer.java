import java.util.Set;

public interface IEngineer extends ISpecialisedSoldier {

    Set<IRepair> getRepairs();

    void addRepair(IRepair r);
}