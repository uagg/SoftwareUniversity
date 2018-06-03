public class Person {
    private String FirstName;
    private String LastName;
    private Integer Age;
    private Double Salary;

    private void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.FirstName = firstName;
    }

    private void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.LastName = lastName;
    }

    public Integer getAge() {
        return this.Age;
    }

    private void setAge(Integer age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.Age = age;
    }

    private void setSalary(Double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.Salary = salary;
    }

    public Person(String firstName, String lastName, Integer age, Double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
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
