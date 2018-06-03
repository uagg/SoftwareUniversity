/*
You are manager on a vehicle park. Your job is to sell cars and give reports to the accounting. You will be given all
vehicles that are available for selling in format like the example below:
c2 c4 v10 v20 b50
Each car is described by vehicle type (single character ‘b’, ‘c’ or ‘v’) and number of seats in the vehicle (natural number).
 For example, “c4” means car with 4 seats, “b50” means bus with 50 seats and “v10” means van with 10 seats.
Then you need to process a sequence of incoming requests. Each request holds type of vehicle and number of seats in
the following format:
Car with 4 seats
Bus with 20 seats
…
If you have vehicle that matches the description of the desired vehicle, you should sell it, otherwise print “No”.
The price is calculated as а product of the character ASCII code and the number of seats. For example, the price
for “c4” (car with 4 seats), will be calculated as 99(‘c’) * 4 = 396. If there are 2 or more matching vehicles you
should sell the leftmost one.
After you run out of customers, you need to print the vehicles that you didn’t sell and the count of sold vehicles.
Input
The input data should be read from the console.
•	On the first input line, you will receive all vehicles in the park, separated with single whitespace.
•	On the next lines, you will receive requests for vehicles in the following format:
“{Vehicle Type} with {Number of seats} seats”
until you receive “End of customers!”
The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
The output should consist of:
•	For each vehicle request you either need to print:
o	“Yes, sold for {price}$” – if the wanted vehicle is available in the park.
o	“No” – if there is no such vehicle in the vehicle park.
•	After you stop receiving request, you need to print two lines:
o	On the first line, you need to print the remaining vehicles in the format:
“Vehicles left: x1, x2, x3…”
o	On the second line, you need to print the total number of vehicles sold in the following format: “Vehicles sold: x1, x2, x3…”
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        String[] vehicles = scanner.nextLine().split("\\s+");
        list.addAll(Arrays.asList(vehicles));

        Integer counter = 0;

        while (true) {
            String current = scanner.nextLine();
            if (current.equals("End of customers!")) {
                break;
            }
            String[] curentCar = current.split("\\s+");
            int quantity = Integer.parseInt(curentCar[2]);
            char typeVehicle = curentCar[0].toLowerCase().charAt(0);
            String searchedCar = "" + typeVehicle + quantity;

            if (list.contains(searchedCar)) {
                int sum = typeVehicle * quantity;
                list.remove(searchedCar);

                System.out.printf("Yes, sold for %d$\n", sum);
                counter++;
            } else {
                System.out.printf("No\n");
            }
        }
        System.out.printf("Vehicles left: ");
        System.out.printf("%s%n", list.toString().substring(1, list.toString().length() - 1));
        System.out.printf("Vehicles sold: %d", counter);
    }
}