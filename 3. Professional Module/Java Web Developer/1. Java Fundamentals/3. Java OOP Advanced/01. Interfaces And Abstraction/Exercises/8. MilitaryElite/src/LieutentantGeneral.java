import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LieutentantGeneral extends Private implements ILieutenantGeneral {

    private List<IPrivate> privates;

    public LieutentantGeneral(String id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public List<IPrivate> getPrivates() {
        return Collections.unmodifiableList(this.privates);
    }

    @Override
    public void addPrivate(IPrivate p) {
        this.privates.add(p);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder(super.toString());
        b.append(System.lineSeparator());

        b.append("Privates:").append(System.lineSeparator());

        for (ISoldier p : this.getPrivates()) {
            b.append("  ").append(p).append(System.lineSeparator());
        }

        return b.toString().trim();
    }
}