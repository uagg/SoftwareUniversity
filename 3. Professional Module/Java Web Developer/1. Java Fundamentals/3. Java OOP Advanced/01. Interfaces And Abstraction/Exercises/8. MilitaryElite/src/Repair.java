public class Repair implements IRepair {

    private String partName;
    private Integer hoursWorked;

    public Repair(String partName, Integer hoursWorked) {
        this.partName = partName;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getPartName() {
        return this.partName;
    }

    @Override
    public Integer getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %s",
                this.getPartName(),
                this.getHoursWorked());
    }
}