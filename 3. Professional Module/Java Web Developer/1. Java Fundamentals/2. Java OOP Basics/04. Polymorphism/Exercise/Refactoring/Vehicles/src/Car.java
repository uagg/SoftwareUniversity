public class Car extends Vehicle{
    private static final double FUEL_CONSUMPTION_CONSTANT = 0.9;

    Car(double quantity, double consumption) {
        super.setFuelQuantity(quantity);
        super.setFuelConsumption(consumption);
    }

    @Override
    public final void drive(double distance) {
        double burnedFuel = distance * (super.getFuelConsumption() + FUEL_CONSUMPTION_CONSTANT);
        if (burnedFuel > super.getFuelQuantity()) {
            throw new IllegalArgumentException("Car needs refueling");
        }

        Double result = super.getFuelQuantity() - burnedFuel;
        super.setFuelQuantity(result);
    }

    @Override
    public final void refuel(double liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        Double result = super.getFuelQuantity() + liters;
        super.setFuelQuantity(result);
    }
}
