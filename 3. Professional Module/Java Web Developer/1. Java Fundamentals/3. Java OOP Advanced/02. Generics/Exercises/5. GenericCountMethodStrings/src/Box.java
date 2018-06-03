public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {

    private T storage;

    public Box(T input){
        this.storage = input;
    }

    public T getStorage() {
        return this.storage;
    }

    @Override
    public String toString() {
        return this.storage.getClass().getName() + ": " + this.storage;
    }

    @Override
    public int compareTo(Box<T> o) {
        return this.storage.compareTo(o.getStorage());
    }
}