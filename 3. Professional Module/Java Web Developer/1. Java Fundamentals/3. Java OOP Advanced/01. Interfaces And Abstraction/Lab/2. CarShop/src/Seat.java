public class Seat implements Car{
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public Seat(String currentModel, String currentColor, Integer hp, String country) {
        this.model = currentModel;
        this.color = currentColor;
        this.horsePower = hp;
        this.countryProduced = country;
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
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", this.model, this.countryProduced, Car.TIRES);
    }
}