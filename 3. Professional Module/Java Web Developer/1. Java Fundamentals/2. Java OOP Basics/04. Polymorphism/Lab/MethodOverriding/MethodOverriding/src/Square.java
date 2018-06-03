public class Square extends Rectangle {
    public Square(Double side) {
        super(side);
    }

    @Override
    public Double area() {
        return this.sideA * this.sideA;
    }
}
