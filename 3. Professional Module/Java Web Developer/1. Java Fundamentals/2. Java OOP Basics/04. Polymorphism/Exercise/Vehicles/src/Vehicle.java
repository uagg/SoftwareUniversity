public abstract class Vehicle {
    protected Double fuelQuantity;
    protected Double fuelConsumption;
    protected Double tankCapacity;

    public final Double getFuelQuantity() {
        return this.fuelQuantity;
    }

    protected final void setFuelQuantity(Double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    protected final Double getFuelConsumption() {
        return this.fuelConsumption;
    }

    protected final void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    protected final void setTankCapacity(Double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public abstract void driven(Double distance);
    public abstract void refuel(Double liters);
}
