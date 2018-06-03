import java.util.List;

public class ListUtils<T> {

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if(list.size() == 0) {
            throw new IllegalArgumentException();
        }

        T min = list.get(0);
        for (T currentItem : list) {
            if(currentItem.compareTo(min) < 0) {
                min = currentItem;
            }
        }

        return min;
    }

    static <T extends Comparable<T>> T getMax(List<T> list) {
        if(list.size() == 0) {
            throw new IllegalArgumentException();
        }

        T max = list.get(0);
        for (T currentItem : list) {
            if(currentItem.compareTo(max) > 0) {
                max = currentItem;
            }
        }

        return max;
    }
}
