public class Bus extends Vehicle {

    public Bus(Double fuelQuantity, Double litersPerKm, Double Capacity) {
        super.setFuelQuantity(fuelQuantity);
        super.setFuelConsumption(litersPerKm);
        super.setTankCapacity(Capacity);
    }

    public void drivenEmpty(Double distance) {
        Double burnedFuel = distance * super.getFuelConsumption();
        if (burnedFuel > super.getFuelQuantity()) {
            throw new IllegalArgumentException("Bus needs refueling");
        } else {
            Double result = super.getFuelQuantity() - burnedFuel;
            super.setFuelQuantity(result);
        }
    }

    @Override
    public void driven(Double distance) {
        Double burnedFuel = distance * (super.getFuelConsumption() + 1.4);
        if (burnedFuel > super.getFuelQuantity()) {
            throw new IllegalArgumentException("Bus needs refueling");
        } else {
            Double result = super.getFuelQuantity() - burnedFuel;
            super.setFuelQuantity(result);
        }
    }

    @Override
    public void refuel(Double liters) {
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
