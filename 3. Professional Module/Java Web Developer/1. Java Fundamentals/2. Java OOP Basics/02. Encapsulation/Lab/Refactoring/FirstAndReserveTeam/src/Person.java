public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Double salary;

    public Person(String inputFirstName, String inputLastName, Integer inputAge, Double inputSalary) {
        this.setFirstName(inputFirstName);
        this.setLastName(inputLastName);
        this.setAge(inputAge);
        this.setSalary(inputSalary);
    }

    private void setFirstName(String inputFirstName) {
        if(inputFirstName.length() < 3) {
            throw new IllegalStateException("First name cannot be less than 3 symbols");
        }
        this.firstName = inputFirstName;
    }

    private String getFirstName() {
        return this.firstName;
    }

    private void setLastName(String inputLastName) {
        if(inputLastName.length() < 3) {
            throw new IllegalStateException("Last name cannot be less than 3 symbols");
        }
        this.lastName = inputLastName;
    }

    private String getLastName() {
        return this.lastName;
    }

    private void setAge(Integer inputAge) {
        if(inputAge < 1) {
            throw new IllegalStateException("Age cannot be zero or negative integer");
        }
        this.age = inputAge;
    }

    Integer getAge() {
        return this.age;
    }

    private void setSalary(Double inputSalary) {
        if(inputSalary < 460.0) {
            throw new IllegalStateException("Salary cannot be less than 460 leva");
        }
        this.salary = inputSalary;
    }

    private Double getSalary() {
        return this.salary;
    }

    public void increaseSalary(Integer bonus) {
        if(this.getAge() > 30) {
            this.salary += this.salary * bonus / 100;
        } else {
            this.salary += this.salary * bonus / 200;
        }
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " gets " + this.getSalary() + " leva";
    }
}
