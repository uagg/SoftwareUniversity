public class Person {
    private String name;
    private int age;

    Person(String inputName, int inputAge) {
        this.setName(inputName);
        this.setAge(inputAge);
    }

    private void setName(String inputName) {
        if(inputName.length() < 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this.name = inputName;
    }

    private String getName() {
        return this.name;
    }

    private int getAge() {
        return this.age;
    }

    void setAge(int inputAge) {
        if(inputAge < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }

        this.age = inputAge;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("Name: %s, Age: %d",
                this.getName(),
                this.getAge()));
        return stringBuilder.toString();
    }
}
