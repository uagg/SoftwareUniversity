public class Spy extends Soldier implements ISpy {

    private Integer codeNumber;

    public Spy(String id, String firstName, String lastName, Integer codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public Integer getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return super.toString().concat(String.format("%nCode Number: %s", this.getCodeNumber()));
    }
}