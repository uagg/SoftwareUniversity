import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        List<Identifiable> list = new ArrayList<>();

        while (!input[0].equals("End")) {
            if (input.length == 3) {
                String name = input[0];
                Integer age = Integer.parseInt(input[1]);
                String id = input[2];
                Identifiable citizen = new Citizen(name, age, id);
                list.add(citizen);
            } else if (input.length == 2) {
                String name = input[0];
                String id = input[1];
                Identifiable robot = new Robot(name, id);
                list.add(robot);
            }

            input = sc.nextLine().split("\\s+");
        }

        String checkForInvalidId = sc.nextLine();

        for (Identifiable entity : list) {
            String currentId = entity.getId();

            if (currentId.endsWith(checkForInvalidId)) {
                System.out.println(currentId);
            }
        }
    }
}
