public class Truck extends Vehicle {
    private static final double FUEL_CONSUMPTION_CONSTANT = 1.6;
    //private static final double HOLE_CONSTANT = 0.95;

    Truck(double quantity, double consumption) {
        super.setFuelQuantity(quantity);
        super.setFuelConsumption(consumption);
    }

    @Override
    public void drive(double distance) {
        Double burnedFuel = distance * (super.getFuelConsumption() + FUEL_CONSUMPTION_CONSTANT);
        if (burnedFuel > super.getFuelQuantity()) {
            throw new IllegalArgumentException("Truck needs refueling");
        }

        super.setFuelQuantity(super.getFuelQuantity() - burnedFuel);
    }

    @Override
    public void refuel(double liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        } else {

        }
    }
}
