public class Bulgarian implements Person {
    private String name;

    public Bulgarian(String name) {
        this.setName(name);
    }

    private void setName(String inputName) {
        this.name = inputName;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
