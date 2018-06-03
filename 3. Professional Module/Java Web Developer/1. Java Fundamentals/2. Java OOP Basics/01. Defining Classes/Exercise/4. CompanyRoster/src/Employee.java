public class Employee extends Person{
    private static final String DEFAULT_EMAIL = "n/a";

    private double salary;
    private String position;
    private String department;
    private String email = DEFAULT_EMAIL;

    public Employee(String inputName, double inputSalary, String inputPosition, String inputDepartment,
                    String inputEmail, int inputAge) {
        super(inputName, inputAge);
        this.salary = inputSalary;
        this.position = inputPosition;
        this.department = inputDepartment;
        this.email = inputEmail;
    }

    public Employee(String inputName, double inputSalary, String inputPosition, String inputDepartment) {
        super(inputName);
        this.salary = inputSalary;
        this.position = inputPosition;
        this.department = inputDepartment;
        this.email = DEFAULT_EMAIL;
    }

    public Employee(String inputName, double inputSalary, String inputPosition, String inputDepartment, String inputEmail) {
        super(inputName);
        this.salary = inputSalary;
        this.position = inputPosition;
        this.department = inputDepartment;
        this.email = inputEmail;
    }

    public Employee(String inputName, double inputSalary, String inputPosition, String inputDepartment, int inputAge) {
        super(inputName, inputAge);
        this.salary = inputSalary;
        this.position = inputPosition;
        this.department = inputDepartment;
        this.email = DEFAULT_EMAIL;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", super.getName(), this.getSalary(), this.email, super.getAge());
    }
}
