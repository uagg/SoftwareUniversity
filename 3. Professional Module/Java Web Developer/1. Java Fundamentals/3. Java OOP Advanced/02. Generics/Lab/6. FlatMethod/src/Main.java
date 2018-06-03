import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        Collections.addAll(ints, 1);

        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 2.2, 3.2);
        List<List<? extends Number>> jagged = new ArrayList<>();
        Collections.addAll(jagged, ints, doubles);
        List<Number> numbers = new ArrayList<>();
        ListUtils.flatten(numbers, jagged);

        System.out.println(numbers);
    }
}
