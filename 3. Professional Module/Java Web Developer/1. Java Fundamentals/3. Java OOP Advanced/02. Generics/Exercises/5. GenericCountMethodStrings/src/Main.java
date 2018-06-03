import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = Integer.parseInt(sc.nextLine());

        List<Box<String>> boxes = new ArrayList<>();

        for (int i = 0; i < counter; i++) {
            String input = sc.nextLine();
            Box<String> box = new Box<>(input);
            boxes.add(box);
        }

        Box<String> target = new Box<>(sc.nextLine());

        int count = 0;

        for (Box<String> b : boxes) {
            if (b.compareTo(target) > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
