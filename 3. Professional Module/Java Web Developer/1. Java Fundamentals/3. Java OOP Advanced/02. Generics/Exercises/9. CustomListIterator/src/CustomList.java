import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements CustomListInterface<T>, Iterable<T> {

    private List<T> items;

    public CustomList() {
        this.items = new ArrayList<>();
    }

    public CustomList(List<T> list) {
        this.items = list;
    }

    public List<T> getItems() {
        return Collections.unmodifiableList(this.items);
    }

    public void sort() {
        this.items.sort(Comparable::compareTo);
    }

    @Override
    public void add(T element) {
        this.items.add(element);
    }

    @Override
    public T remove(int index) {
        return this.items.remove(index);
    }

    @Override
    public boolean contains(T element) {
        return this.items.contains(element);
    }

    @Override
    public void swap(int firstIndex, int secondIndex) {
        T temp = this.items.get(firstIndex);
        this.items.set(firstIndex, this.items.get(secondIndex));
        this.items.set(secondIndex, temp);
    }

    @Override
    public int countGreaterThat(T element) {
        int count = 0;
        for (T item : this.items) {
            if (item.compareTo(element) > 0) {
                count += 1;
            }
        }
        return count;
    }

    @Override
    public T getMax() {
        return Collections.max(this.items);
    }

    @Override
    public T getMin() {
        return Collections.min(this.items);
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();

        for (T item : this.items) {
            b.append(item).append(System.lineSeparator());
        }

        return b.toString().trim();
    }

    @Override
    public Iterator<T> iterator() {
        return this.items.iterator();
    }
}
