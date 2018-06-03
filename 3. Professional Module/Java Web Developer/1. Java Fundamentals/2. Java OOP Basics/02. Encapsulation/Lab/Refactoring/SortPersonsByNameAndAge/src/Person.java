public class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String inputFirstName, String inputLastName, int inputAge) {
        this.setFirstName(inputFirstName);
        this.setLastName(inputLastName);
        this.setAge(inputAge);
    }

    private void setFirstName(String inputFirstName) {
        this.firstName = inputFirstName;
    }

    public String getFirstName() {
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

    public Integer getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " is " + this.getAge() + " years old.";
    }
}
