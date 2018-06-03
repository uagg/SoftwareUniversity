public class Rectangle {
    protected Double sideA;
    protected Double sideB;

    public Rectangle(Double sideA) {
        this.sideA = sideA;
    }

    public Rectangle(Double sideA, Double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Double area() {
        return this.sideA * this.sideB;
    }
}
