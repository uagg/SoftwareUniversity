import java.text.DecimalFormat;

public class Private extends Soldier implements IPrivate {

    private Double salary;

    public Private(String id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public Double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        String salary = new DecimalFormat("0.00").format(this.getSalary());
        return super.toString().concat(String.format(" Salary: %s", salary));
    }
}