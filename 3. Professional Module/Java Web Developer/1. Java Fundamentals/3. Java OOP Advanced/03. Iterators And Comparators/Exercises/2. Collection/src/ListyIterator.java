import java.util.Iterator;

public class ListyIterator implements IListyIterator, Iterable<String> {

    private String[] items;
    private int index;

    public ListyIterator(String... items) {
        this.items = items;
        this.index = 0;
    }

    @Override
    public boolean move() {
        if(this.index < this.items.length - 1) {
            this.index += 1;
            return true;
        }
        return false;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.items.length - 1;
    }

    @Override
    public void print() {
        if(this.items.length == 0) {
            throw new IllegalStateException("Invalid Operation!");
        }

        System.out.println(this.items[this.index]);
    }

    @Override
    public Iterator<String> iterator() {
        return new ListyIteratorInstance();
    }

    private final class ListyIteratorInstance implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return this.index < items.length;
        }

        @Override
        public String next() {
            return items[this.index++];
        }
    }
}
