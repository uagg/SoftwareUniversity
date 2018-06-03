abstract class Entity implements Birthable {

    private String name;
    private String birthDate;

    protected Entity(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}