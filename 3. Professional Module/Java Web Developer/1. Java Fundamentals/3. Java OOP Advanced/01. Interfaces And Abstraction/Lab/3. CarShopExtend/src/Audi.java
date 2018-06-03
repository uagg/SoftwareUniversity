public class Audi implements Rentable {
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;
    private Double pricePerDay;
    private Integer minRentDays;

    public Audi(String currentModel, String currentColor, Integer hp, String countryProduced, Integer minRentDays, Double pricePerDay) {
        this.model = currentModel;
        this.color = currentColor;
        this.horsePower = hp;
        this.countryProduced = countryProduced;
        this.minRentDays = minRentDays;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDays;
    }

    @Override
    public Double getPricePerDay() {
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
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", this.model, this.countryProduced, Car.TIRES);
    }
}
