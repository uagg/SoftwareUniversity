public class Seat implements Sellable {
    private String name;
    private String color;
    private int hp;
    private String country;
    private double price;

    public Seat(String name, String color, int hp, String country, double price) {
        this.name = name;
        this.color = color;
        this.hp = hp;
        this.country = country;
        this.price = price;
    }

    @Override
    public String getModel() {
        return this.name;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.hp;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", this.name, this.country, Car.TIRES);
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}