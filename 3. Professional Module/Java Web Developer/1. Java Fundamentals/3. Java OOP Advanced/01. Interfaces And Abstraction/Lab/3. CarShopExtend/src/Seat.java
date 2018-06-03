import java.io.Serializable;

public class Seat implements Car, Serializable, Sellable{
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;
    private Double price;

    public Seat(String currentModel, String currentColor, Integer hp, String country, Double price) {
        this.model = currentModel;
        this.color = currentColor;
        this.horsePower = hp;
        this.countryProduced = country;
        this.price = price;
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
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", this.model, this.countryProduced, Car.TIRES);
    }
}