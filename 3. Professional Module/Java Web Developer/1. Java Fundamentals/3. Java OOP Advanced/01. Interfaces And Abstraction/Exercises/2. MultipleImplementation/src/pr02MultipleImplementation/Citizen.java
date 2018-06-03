package pr02MultipleImplementation;

public class Citizen implements Person, Identifiable, Birthable {
    private String name;
    private Integer age;
    private String birthdate;
    private String id;

    public Citizen(String currentName, Integer currentAge, String id, String birthdate) {
        this.setName(currentName);
        this.setAge(currentAge);
        this.setId(id);
        this.setBirthdate(birthdate);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(Integer age) {
        this.age = age;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    private void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String getBirthdate() {
        return this.birthdate;
    }

    @Override
    public String getId() {
        return this.id;
    }
}