import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {private static final String DELIMITER = "\\s+";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] nameAndAddress = reader.readLine().split(DELIMITER);
        String name = nameAndAddress[0] + " " + nameAndAddress[1];
        String address = nameAndAddress[2];
        String town = nameAndAddress[3];

        Threeuple<String, String, String> first = new Threeuple<>(name, address, town);

        String[] nameAndBeer = reader.readLine().split(DELIMITER);
        String beerPersonName = nameAndBeer[0];
        int litresOfBeer = Integer.parseInt(nameAndBeer[1]);
        String drunkOrNotRaw = nameAndBeer[2];

        boolean drunkOrNot = false;

        if ("drunk".equals(drunkOrNotRaw)) {
            drunkOrNot = true;
        }

        Threeuple<String, Integer, Boolean> second =
                new Threeuple<>(beerPersonName, litresOfBeer, drunkOrNot);

        String[] bankStuff = reader.readLine().split(DELIMITER);
        String bankPersonName = bankStuff[0];
        double balance = Double.parseDouble(bankStuff[1]);
        String bankName = bankStuff[2];

        Threeuple<String, Double, String> third = new Threeuple<>(bankPersonName, balance, bankName);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}