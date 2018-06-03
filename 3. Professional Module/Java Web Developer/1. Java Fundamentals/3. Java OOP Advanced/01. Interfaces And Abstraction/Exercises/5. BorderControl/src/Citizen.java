public class Citizen extends Entity implements Identifiable {

    private Integer age;

    protected Citizen(String name, Integer age, String id) {
        super(name, id);
        this.age = age;
    }
}
