public class Box<T> {

    private T storage;

    public Box(T input){
        this.storage = input;
    }

    @Override
    public String toString() {
        return this.storage.getClass().getName() + ": " + this.storage;
    }
}
