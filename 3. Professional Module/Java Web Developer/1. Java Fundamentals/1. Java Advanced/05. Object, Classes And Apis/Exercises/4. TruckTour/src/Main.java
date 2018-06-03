/*
Suppose there is a circle. There are N petrol pumps on that circle. Petrol pumps are numbered 0 to N - 1 (both inclusive).
You will get N on the first line.
On the next N lines, you will be given:
•	the amount of petrol that particular petrol pump will give
•	the distance from that petrol pump to the next petrol pump.
Initially, you have a tank of infinite capacity carrying no petrol. You can start the tour at any of the petrol pumps.
Considering that the truck will stop at each of the petrol pumps, calculate the first point (The smallest index of a
petrol pump station) from where the truck will be able to complete a full circle.  The truck will move one kilometer
for each liter of petrol.
Input
•	The first line will contain the value of N: 1 ≤ N ≤ 1000001
•	The next N lines will contain a pair of integers each, i.e. the amount of petrol that petrol pump will give and
the distance between that petrol pump and the next petrol pump.
•	1 ≤ Amount of petrol, Distance ≤ 1000000000
 */
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        ArrayDeque<String> petrolDistance = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            petrolDistance.addLast(in.nextLine());
        }

        long index = 0;
        while (true) {
            long petrol = 0;
            String currentCommand = petrolDistance.removeFirst();
            String[] station = currentCommand.split(" ");
            long currentPetrol = Long.parseLong(station[0]);
            long kilometers = Long.parseLong(station[1]);

            petrol += currentPetrol - kilometers;
            if (petrol >= 0) {
                boolean hasSucceeded = true;

                for (String stationData : petrolDistance) {
                    String[] stationArgs = stationData.split("\\s+");
                    long currentPetrolOfTheStation = Long.parseLong(stationArgs[0]);
                    long currentKilometers = Long.parseLong(stationArgs[1]);

                    petrol += currentPetrolOfTheStation - currentKilometers;
                    if (petrol < 0) {
                        hasSucceeded = false;
                        break;
                    }
                }

                if (hasSucceeded) {
                    System.out.println(index);
                    return;
                }else {
                    petrolDistance.addLast(currentCommand);
                }
            } else {
                petrolDistance.addLast(currentCommand);
            }
            index++;
        }
    }
}