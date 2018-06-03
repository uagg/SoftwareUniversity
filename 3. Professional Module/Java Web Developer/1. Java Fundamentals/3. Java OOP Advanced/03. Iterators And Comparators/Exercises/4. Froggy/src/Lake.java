import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake<T> implements Iterable<T> {

    private List<T> elements;

    public Lake(T... elements) {
        this.elements = new ArrayList<>();
        List<T> odd = new ArrayList<>();

        for (int i = 0; i < elements.length; i++) {
            if (i % 2 == 0) {
                this.elements.add(elements[i]);
            } else {
                odd.add(elements[i]);
            }
        }

        this.elements.addAll(odd);
    }

    @Override
    public Iterator<T> iterator() {
        return new Frog();
    }

    private final class Frog implements Iterator<T> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return this.index < elements.size();
        }

        @Override
        public T next() {
            return elements.get(this.index++);
        }
    }
}
