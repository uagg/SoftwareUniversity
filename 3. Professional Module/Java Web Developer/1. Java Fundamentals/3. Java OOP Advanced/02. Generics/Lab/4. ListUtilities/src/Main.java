import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        Collections.addAll(ints, 1, 2, 123, 1, 2, 13, 3);

        System.out.println(ListUtils.getMax(ints));
        System.out.println(ListUtils.getMin(ints));
    }
}
