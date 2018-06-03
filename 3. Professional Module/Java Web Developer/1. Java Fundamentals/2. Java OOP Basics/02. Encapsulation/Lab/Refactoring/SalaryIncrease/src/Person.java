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
        this.firstName = inputFirstName;
    }

    private String getFirstName() {
        return this.firstName;
    }

    private void setLastName(String inputLastName) {
        this.lastName = inputLastName;
    }

    private String getLastName() {
        return this.lastName;
    }

    private void setAge(Integer inputAge) {
        this.age = inputAge;
    }

    private Integer getAge() {
        return this.age;
    }

    private void setSalary(Double inputSalary) {
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
