import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Commando extends SpecialisedSoldier implements ICommando {

    private Set<IMission> missions;

    public Commando(String id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new LinkedHashSet<>();
    }

    @Override
    public Set<IMission> getMissions() {
        return Collections.unmodifiableSet(this.missions);
    }

    @Override
    public void addMission(IMission m) {
        this.missions.add(m);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder(super.toString());
        b.append(System.lineSeparator());

        b.append("Missions:")
                .append(System.lineSeparator());

        for (IMission mission : this.getMissions()) {
            b.append("  ").append(mission)
                    .append(System.lineSeparator());
        }

        return b.toString().trim();
    }
}