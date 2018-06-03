public class Tuple<F, S> {

    private F first;
    private S second;

    public Tuple(F first, S second) {
        this.setFirst(first);
        this.setSecond(second);
    }

    private F getFirst() {
        return this.first;
    }

    private void setFirst(F first) {
        this.first = first;
    }

    private S getSecond() {
        return this.second;
    }

    private void setSecond(S second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", this.getFirst(), this.getSecond());
    }
}
