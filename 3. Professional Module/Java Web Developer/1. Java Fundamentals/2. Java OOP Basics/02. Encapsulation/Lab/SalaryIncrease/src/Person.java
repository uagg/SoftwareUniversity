public class Person {
    private String FirstName;
    private String LastName;
    private Integer Age;
    private Double Salary;

    public String getFirstName() {
        return this.FirstName;
    }

    public Integer getAge() {
        return this.Age;
    }

    public Double getSalary() {
        return this.Salary;
    }

    public void setSalary(Double salary) {
        this.Salary = salary;
    }

    public Person(String firstName, String lastName, Integer age, Double salary) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Age = age;
        this.Salary = salary;
    }

    public void increaseSalary(Integer bonus) {
        if (this.Age > 30) {
            this.Salary += this.Salary * bonus / 100;
        } else {
            this.Salary += this.Salary * bonus / 200;
        }
    }

    @Override
    public String toString() {
        return this.FirstName + " " + this.LastName + " get " + this.Salary + " leva";
    }
}