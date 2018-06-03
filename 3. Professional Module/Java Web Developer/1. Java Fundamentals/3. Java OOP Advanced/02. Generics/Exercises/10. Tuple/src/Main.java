import java.util.Scanner;

public class Main {

    private static final String DELIMITER = "\\s+";
    private static final int FIRST_ELEMENT = 0;
    private static final int SECOND_ELEMENT = 1;
    private static final int THIRD_ELEMENT = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nameAndAdress = sc.nextLine().split(DELIMITER);
        String name = nameAndAdress[FIRST_ELEMENT] + " " + nameAndAdress[SECOND_ELEMENT];
        String adress = nameAndAdress[THIRD_ELEMENT];

        Tuple<String, String> first = new Tuple<>(name, adress);

        String[] nameAndBeer = sc.nextLine().split(DELIMITER);
        String beerName = nameAndBeer[FIRST_ELEMENT];
        int beerInLiters = Integer.parseInt(nameAndBeer[SECOND_ELEMENT]);

        Tuple<String, Integer> second = new Tuple<>(beerName, beerInLiters);

        String[] intAndDouble = sc.nextLine().split(DELIMITER);
        int aInt = Integer.parseInt(intAndDouble[FIRST_ELEMENT]);
        double aDouble = Double.parseDouble(intAndDouble[SECOND_ELEMENT]);

        Tuple<Integer, Double> third = new Tuple<>(aInt, aDouble);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
