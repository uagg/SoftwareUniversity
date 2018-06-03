public class Rectangle {
    double sideA;
    double sideB;

    public Rectangle(double a) {
        this.sideA = a;
    }

    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;

    }

    public double area() {
        return this.sideA * this.sideB;
    }
}
