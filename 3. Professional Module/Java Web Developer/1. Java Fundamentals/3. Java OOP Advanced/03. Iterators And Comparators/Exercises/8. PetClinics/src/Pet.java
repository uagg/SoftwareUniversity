public class Pet {

    private String name;
    private int age;
    private String kind;

    public Pet(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getKind() {
        return this.kind;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",
                this.getName(), this.getAge(), this.getKind());
    }
}