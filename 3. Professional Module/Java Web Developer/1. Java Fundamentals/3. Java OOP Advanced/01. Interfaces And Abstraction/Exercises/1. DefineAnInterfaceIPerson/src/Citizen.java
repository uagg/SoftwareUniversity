public class Citizen implements Person {
    private String name;
    private Integer age;

    public Citizen(String currentName, Integer currentAge) {
        this.setName(currentName);
        this.setAge(currentAge);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }
}
