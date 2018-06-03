import java.util.List;

public class ListUtils {
    static <T> void addAll(List<? super T> destination, List<? extends T> source) {
        for (T element : source) {
            destination.add(element);
        }
    }
}
