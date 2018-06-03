public class Scale<S extends Comparable<S>> {

    private S left;
    private S right;

    public Scale(S left, S right) {
        this.left = left;
        this.right = right;
    }

    public S getHeavier() {
        if (left.compareTo(right) < 0) {
            return right;
        } else if (left.compareTo(right) > 0) {
            return left;
        }

        return null;
    }
}
