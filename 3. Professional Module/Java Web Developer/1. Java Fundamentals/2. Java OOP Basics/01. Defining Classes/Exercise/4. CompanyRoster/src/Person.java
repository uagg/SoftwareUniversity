public class Person {
    private final static int DEFAULT_AGE = -1;

    private String name;
    private int age;

    public Person(String inputName) {
        this(inputName, DEFAULT_AGE);
    }

    public Person(String inputName, int inputAge) {
        this.name = inputName;
        this.age = inputAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
