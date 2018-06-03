public class Person {

    protected String name;
    protected int age;

    public Person() {
        this(1);
        this.setName("No name");
    }

    public Person(int inputAge) {
        this("No name", inputAge);
    }

    public Person(String inputName, int inputAge) {
        this.setName(inputName);
        this.setAge(inputAge);
    }

    private void setName(String inputName) {
        this.name = inputName;
    }

    private void setAge(int inputAge) {
        this.age= inputAge;
    }
}
