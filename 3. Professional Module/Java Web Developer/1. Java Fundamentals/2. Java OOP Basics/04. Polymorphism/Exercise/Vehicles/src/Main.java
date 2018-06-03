import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] carInfo = input.nextLine().split("\\s+");
        Double carFuelQuantity = Double.parseDouble(carInfo[1]);
        Double carLitersPerKm = Double.parseDouble(carInfo[2]);
        Double carTankCapacity = Double.parseDouble(carInfo[3]);
        Car car = new Car(carFuelQuantity, carLitersPerKm, carTankCapacity);
        String[] truckInfo = input.nextLine().split("\\s+");
        Double truckFuelQuantity = Double.parseDouble(truckInfo[1]);
        Double truckLitersPerKm = Double.parseDouble(truckInfo[2]);
        Double truckTankCapacity = Double.parseDouble(carInfo[3]);
        Truck truck = new Truck(truckFuelQuantity, truckLitersPerKm, truckTankCapacity);
        String[] busInfo = input.nextLine().split("\\s+");
        Double busFuelQuantity = Double.parseDouble(busInfo[1]);
        Double busLitersPerKm = Double.parseDouble(busInfo[2]);
        Double busTankCapacity = Double.parseDouble(busInfo[3]);
        Bus bus = new Bus(busFuelQuantity, busLitersPerKm, busTankCapacity);
        int numberOfCommands = Integer.parseInt(input.nextLine());

        DecimalFormat df = new DecimalFormat("0.######");

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = input.nextLine().split("\\s+");
            String action = command[0];
            String vehicleType = command[1];
            Double distanceOrLiters = Double.parseDouble(command[2]);

            if (vehicleType.equals("Car")) {
                if (action.equals("Drive")) {
                    try {
                        car.driven(distanceOrLiters);
                        System.out.printf("Car travelled %s km%n", df.format(distanceOrLiters));
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                } else if (action.equals("Refuel")) {
                    try {
                        car.refuel(distanceOrLiters);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                }
            } else if (vehicleType.equals("Truck")) {
                if (action.equals("Drive")) {
                    try {
                        truck.driven(distanceOrLiters);
                        System.out.printf("Truck travelled %s km%n", df.format(distanceOrLiters));
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                } else if (action.equals("Refuel")) {
                    try {
                        truck.refuel(distanceOrLiters);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                }
            } else if (vehicleType.equals("Bus")) {
                if (action.equals("Drive")) {
                    try {
                        bus.driven(distanceOrLiters);
                        System.out.printf("Bus travelled %s km%n", df.format(distanceOrLiters));
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                } else if (action.equals("DriveEmpty")) {
                    try {
                        bus.drivenEmpty(distanceOrLiters);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                } else if (action.equals("Refuel")) {
                    try {
                        bus.refuel(distanceOrLiters);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                }
            }
        }

        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f", bus.getFuelQuantity());
    }
}
