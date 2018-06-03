import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = Integer.parseInt(sc.nextLine());

        List<Box<Double>> boxes = new ArrayList<>();

        for (int i = 0; i < counter; i++) {
            Double input = Double.parseDouble(sc.nextLine());
            Box<Double> box = new Box<>(input);
            boxes.add(box);
        }

        Box<Double> target = new Box<>(Double.parseDouble(sc.nextLine()));

        int count = 0;

        for (Box<Double> b : boxes) {
            if (b.compareTo(target) > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}