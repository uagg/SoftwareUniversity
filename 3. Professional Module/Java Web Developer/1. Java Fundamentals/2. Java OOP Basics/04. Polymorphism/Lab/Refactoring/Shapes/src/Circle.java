public class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.setRadius(radius);
    }

    private double getRadius() {
        return this.radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void calculatePerimeter() {
        super.setPerimeter(Math.PI * 2 * this.getRadius());
    }

    @Override
    void calculateArea() {
        super.setArea(Math.PI * this.getRadius() * this.getRadius());
    }
}
