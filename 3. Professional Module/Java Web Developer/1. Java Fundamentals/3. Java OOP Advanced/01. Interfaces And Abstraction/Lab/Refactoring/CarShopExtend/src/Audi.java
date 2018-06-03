public class Audi implements Rentable{
    private int minRentDays;
    private double pricePerDay;
    private String model;
    private String color;
    private int hp;
    private String country;

    public Audi(String name, String color, int hp, String country, int minRentDays, double pricePerDay) {
        this.model = name;
        this.color = color;
        this.hp = hp;
        this.country = country;
        this.minRentDays = minRentDays;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public int getMinRentDay() {
        return this.minRentDays;
    }

    @Override
    public double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String getModel() {
        return this.model;
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
        return String.format("This is %s produced in %s and have %d tires", this.model, this.country, Car.TIRES);
    }
}
