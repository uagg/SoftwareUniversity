import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyStack<T extends Integer> implements Iterable<T> {

    private List<T> items;

    public MyStack() {
        this.items = new ArrayList<>();
    }

    public void push(T... elements) {
        for (int i = 0; i < elements.length; i++) {
            this.items.add(0, elements[i]);
        }
    }

    public T pop() {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("No elements");
        }

        return this.items.remove(0);
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    private final class CustomIterator implements Iterator<T> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return this.index < items.size();
        }

        @Override
        public T next() {
            return items.get(this.index++);
        }
    }
}
