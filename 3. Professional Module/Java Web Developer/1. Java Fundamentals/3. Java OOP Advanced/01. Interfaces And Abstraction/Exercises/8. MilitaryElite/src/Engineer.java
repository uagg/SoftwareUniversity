import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Engineer extends SpecialisedSoldier implements IEngineer {

    private Set<IRepair> repairs;

    public Engineer(String id, String firstName, String lastName, Double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new LinkedHashSet<>();
    }

    @Override
    public Set<IRepair> getRepairs() {
        return Collections.unmodifiableSet(this.repairs);
    }

    @Override
    public void addRepair(IRepair r) {
        this.repairs.add(r);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder(super.toString());
        b.append(System.lineSeparator());

        b.append("Repairs:")
                .append(System.lineSeparator());

        for (IRepair repair : this.getRepairs()) {
            b.append("  ").append(repair)
                    .append(System.lineSeparator());
        }

        return b.toString().trim();
    }
}