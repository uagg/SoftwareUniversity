/*
Write program that:
•	Records a car number for every car that enters a parking lot
•	Removes a car number when a car goes out
The input will be a string in format [direction, carNumber] and ends with the string "END"
Print the all car numbers which are in the parking lot at the end.
The order of the output does not matter.
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String directionAndCar = input.nextLine();

        Set<String> parkingLots = new HashSet<>();

        while (!directionAndCar.equals("END")) {
            String[] tokens = directionAndCar.split(", ");
            String direction = tokens[0];
            String carNumber = tokens[1];

            switch (direction) {
                case "IN":
                    parkingLots.add(carNumber);
                    break;
                case "OUT":
                    parkingLots.remove(carNumber);
                    break;
            }

            directionAndCar = input.nextLine();
        }

        if (parkingLots.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String plate : parkingLots) {
                System.out.println(plate);
            }
        }
    }
}