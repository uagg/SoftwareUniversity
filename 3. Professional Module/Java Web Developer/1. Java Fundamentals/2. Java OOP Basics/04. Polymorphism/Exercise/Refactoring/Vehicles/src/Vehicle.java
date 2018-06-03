abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    double getFuelQuantity() {
        return this.fuelQuantity;
    }

    void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    double getFuelConsumption() {
        return this.fuelConsumption;
    }

    void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    abstract void drive(double distance);
    abstract void refuel(double liters);
}
