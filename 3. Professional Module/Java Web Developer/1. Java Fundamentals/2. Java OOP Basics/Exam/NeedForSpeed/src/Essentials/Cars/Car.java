package Essentials.Cars;

public abstract class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private int horsepower;
    private int acceleration;
    private int suspension;
    private int durability;

    public Car(String inputBrand, String inputModel, int inputYearOfProduction, int inputHorsePower, int inputAcceleration,
               int inputSuspension, int inputDurability) {
        this.setBrand(inputBrand);
        this.setModel(inputModel);
        this.setYearOfProduction(inputYearOfProduction);
        this.setHorsepower(inputHorsePower);
        this.setAcceleration(inputAcceleration);
        this.setSuspension(inputSuspension);
        this.setDurability(inputDurability);
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return this.yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getAcceleration() {
        return this.acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getSuspension() {
        return this.suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public int getDurability() {
        return this.durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
