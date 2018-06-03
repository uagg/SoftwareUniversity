public class Person {
    private String FirstName;
    private String LastName;
    private Integer Age;

    public String getFirstName() {
        return this.FirstName;
    }

    public Integer getAge() {
        return this.Age;
    }

    public Person(String firstName, String lastName, int age) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Age = age;
    }

    @Override
    public String toString() {
        return this.FirstName + " " + this.LastName + " is a " + this.Age + " years old.";
    }
}
