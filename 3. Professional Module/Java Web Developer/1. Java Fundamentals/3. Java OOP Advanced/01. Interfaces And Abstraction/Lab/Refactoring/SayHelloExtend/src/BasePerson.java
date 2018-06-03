public abstract class BasePerson implements Person {
    private String name;
    protected BasePerson(String name) {
        this.setName(name);
    }
    private void setName(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
