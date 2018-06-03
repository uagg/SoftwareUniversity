class Threeuple<F, S, T> {

    private F first;
    private S second;
    private T third;

    public Threeuple(F first, S second, T third) {
        this.setFirst(first);
        this.setSecond(second);
        this.setThird(third);
    }

    public T getThird() {
        return this.third;
    }

    private void setThird(T third) {
        this.third = third;
    }

    public F getFirst() {
        return this.first;
    }

    private void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return this.second;
    }

    private void setSecond(S second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", this.first, this.second, this.third);
    }
}
