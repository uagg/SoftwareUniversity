public class Truck extends Vehicle {

    public Truck (Double fuelQuantity, Double litersPerKm, Double Capacity) {
        super.setFuelQuantity(fuelQuantity);
        super.setFuelConsumption(litersPerKm);
        super.setTankCapacity(Capacity);
    }

    @Override
    public final void driven(Double distance) {
        Double burnedFuel = distance * (super.getFuelConsumption() + 1.6);
        if (burnedFuel > super.getFuelQuantity()) {
            throw new IllegalArgumentException("Truck needs refueling");
        } else {
            Double result = super.getFuelQuantity() - burnedFuel;
            super.setFuelQuantity(result);
        }
    }

    @Override
    public final void refuel(Double liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        } else {

        }
    }
}
