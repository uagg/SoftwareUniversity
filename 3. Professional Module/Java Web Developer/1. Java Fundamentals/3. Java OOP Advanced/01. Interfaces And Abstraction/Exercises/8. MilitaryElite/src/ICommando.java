import java.util.Set;

public interface ICommando extends ISpecialisedSoldier {

    Set<IMission> getMissions();

    void addMission(IMission m);
}