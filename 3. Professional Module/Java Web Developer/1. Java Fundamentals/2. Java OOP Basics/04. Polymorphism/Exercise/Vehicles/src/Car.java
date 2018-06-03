public class Car extends Vehicle {

    public Car (Double fuelQuantity, Double litersPerKm, Double Capacity) {
        super.setFuelQuantity(fuelQuantity);
        super.setFuelConsumption(litersPerKm);
        super.setTankCapacity(Capacity);
    }

    @Override
    public final void driven(Double distance) {
        Double burnedFuel = distance * (super.getFuelConsumption() + 0.9);
        if (burnedFuel > super.getFuelQuantity()) {
            throw new IllegalArgumentException("Car needs refueling");
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
            Double currentFuelInLiters = super.getFuelQuantity();
            if (liters > currentFuelInLiters) {
                throw new IllegalArgumentException("Cannot fit fuel in tank");
            } else {
                Double result = super.getFuelQuantity() + liters;
                super.setFuelQuantity(result);
            }
        }
    }
}
