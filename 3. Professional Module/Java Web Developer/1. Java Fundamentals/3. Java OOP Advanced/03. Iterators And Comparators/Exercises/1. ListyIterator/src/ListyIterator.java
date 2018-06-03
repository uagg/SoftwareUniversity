public class ListyIterator implements IListyIterator {

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
}
