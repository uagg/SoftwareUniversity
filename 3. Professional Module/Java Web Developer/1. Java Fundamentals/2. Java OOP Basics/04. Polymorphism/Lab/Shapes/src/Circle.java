public class Circle extends Shape {
    private Double radius;

    public Circle (Double r) {
        this.setRadius(r);
    }

    @Override
    public Double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public Double getArea() {
        return super.getArea();
    }

    private final Double getRadius() {
        return this.radius;
    }

    private void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        Double perimeter = 2 * Math.PI * this.getRadius();
        super.setPerimeter(perimeter);
    }

    @Override
    public void calculateArea() {
        Double area = Math.PI * Math.pow(this.getRadius(), 2);
        super.setArea(area);
    }
}
