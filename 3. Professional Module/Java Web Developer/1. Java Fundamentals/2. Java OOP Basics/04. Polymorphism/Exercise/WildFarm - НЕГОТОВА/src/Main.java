import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int counter = 0;

        while (input.equals("End")) {
            if (counter % 2 == 0) {
                String[] tokens = input.split(" ");
                String animalType = tokens[0];
                String animalName = tokens[1];
                String animalWeight = tokens[2];
                String animalLivingRegion = tokens[3];

                if (animalType.equals("Cat")) {
                    String CatBreed = tokens[4];
                }
            } else {
                String[] tokens = input.split(" ");
                String foodType = tokens[0];
                Integer quantity = Integer.parseInt(tokens[1]);

                if (foodType.equals("Vegetable")) {

                }
            }

            counter++;
        }
    }
}
