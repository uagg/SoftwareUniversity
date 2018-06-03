public class Rectangle extends Shape {
    private Double height;
    private Double width;

    public Rectangle (Double sideA, Double sideB) {
        this.setHeight(sideA);
        this.setWidth(sideB);
    }

    @Override
    public Double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public Double getArea() {
        return super.getArea();
    }

    private Double getHeight() {
        return this.height;
    }

    private void setHeight(Double height) {
        this.height = height;
    }

    private Double getWidth() {
        return this.width;
    }

    private void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public void calculatePerimeter() {
        Double perimeter = ( this.getHeight() + this.getWidth() ) * 2;
        super.setPerimeter(perimeter);
    }

    @Override
    public void calculateArea() {
        Double area = this.getHeight() * this.getWidth();
        super.setArea(area);
    }
}
