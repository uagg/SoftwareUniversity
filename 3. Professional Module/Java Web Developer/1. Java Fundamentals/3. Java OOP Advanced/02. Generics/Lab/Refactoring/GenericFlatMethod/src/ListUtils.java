import java.util.List;

public class ListUtils {
    public static <T> void flatten(List<? super T> destination, List<List<? extends T>> source) {
        for (List<? extends T> inner : source) {
            destination.addAll(inner);
        }
    }
}
