public abstract class Entity implements Identifiable {

    private String name;
    private String id;

    protected Entity(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
