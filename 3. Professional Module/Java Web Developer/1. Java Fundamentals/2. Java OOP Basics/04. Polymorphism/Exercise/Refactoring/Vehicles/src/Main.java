import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Car
        String[] carInfo = reader.readLine().split("\\s+");
        double carFuelQuantity = Double.parseDouble(carInfo[1]);
        double carFuelConsumption = Double.parseDouble(carInfo[2]);
        Car car = new Car(carFuelQuantity, carFuelConsumption);

        // Truck
        String[] truckInfo = reader.readLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(truckInfo[1]);
        double truckFuelConsumption = Double.parseDouble(truckInfo[2]);
        Truck truck = new Truck(truckFuelQuantity, truckFuelConsumption);

        // Amount of commands
        int cmds = Integer.parseInt(reader.readLine());

        while(cmds-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");
            String currentCommand = tokens[0];
            String typeOfVehicle =tokens[1];
            double quantityOrConsumption = Double.parseDouble(tokens[2]);

            UseVehicle(car, truck, currentCommand, typeOfVehicle, quantityOrConsumption);
        }

        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f", truck.getFuelQuantity());
    }

    private static void UseVehicle(Car car, Truck truck, String currentCommand, String typeOfVehicle, double quantityOrConsumption) {
        switch (currentCommand) {
            case "Drive":
                if("Car".equals(typeOfVehicle)) {
                    try {
                        car.drive(quantityOrConsumption);
                        System.out.printf("Car travelled %.0f km%n", quantityOrConsumption);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                } else if("Truck".equals(typeOfVehicle)) {
                    try {
                        truck.drive(quantityOrConsumption);
                        System.out.printf("Truck travelled %.0f km%n", quantityOrConsumption);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                }
                break;
            case "Refuel":
                if("Car".equals(typeOfVehicle)) {
                    try {
                        car.refuel(quantityOrConsumption);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                } else if("Truck".equals(typeOfVehicle)) {
                    try {
                        truck.refuel(quantityOrConsumption);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                }
                break;
        }
    }
}
