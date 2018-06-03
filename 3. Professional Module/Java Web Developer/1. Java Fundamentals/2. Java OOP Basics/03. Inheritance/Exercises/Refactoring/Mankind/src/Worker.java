public class Worker extends Human {
    private double salary;
    private double workingHours;

    Worker(String inputFirstName, String inputLastName, double inputSalary, double inputWorkingHours) {
        super(inputFirstName, inputLastName);
        this.setSalary(inputSalary);
        this.setWorkingHours(inputWorkingHours);
    }

    private void setSalary(double inputSalary) {

        if(inputSalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument:weekSalary");
        }

        this.salary = inputSalary;
    }

    private double getSalary() {
        return this.salary;
    }

    private double getWorkingHours() {
        return this.workingHours;
    }

    private double getSalaryPerHour() {
        return this.getSalary() / 7 / this.getWorkingHours();
    }

    private void setWorkingHours(double inputWorkingHours) {

        if(!(inputWorkingHours > 1) || !(inputWorkingHours < 12)) {
            throw new IllegalArgumentException("Expected value mismatch!Argument:workHoursPerDay");
        }

        this.workingHours = inputWorkingHours;
    }

    @Override
    void setLastName(String lastName) {
        if(lastName.length() <= 3) {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    @Override
    public String toString() {
        return String.format("First Name: %s%nLast Name: %s%nWeek Salary: %.2f%nHours per day: %.2f%nSalary per hour: %.2f%n",
                super.getFirstName(), super.getLastName(), this.getSalary(), this.getWorkingHours(), this.getSalaryPerHour());
    }
}