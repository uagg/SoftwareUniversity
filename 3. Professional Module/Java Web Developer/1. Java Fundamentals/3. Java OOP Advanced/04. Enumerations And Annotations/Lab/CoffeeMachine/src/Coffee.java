public class Coffee {

    private CoffeeSize cs;
    private CoffeeType ct;

    public Coffee(String size, String type) {
        this.cs = CoffeeSize.valueOf(size.toUpperCase());
        this.ct = CoffeeType.valueOf(type.toUpperCase());
    }

    public int getSize() {
        return this.cs.getC();
    }
}
