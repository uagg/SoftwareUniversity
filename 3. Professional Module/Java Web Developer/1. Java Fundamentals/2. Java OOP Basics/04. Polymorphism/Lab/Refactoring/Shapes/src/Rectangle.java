public class Rectangle extends Shape {
    private double height;
    private double width;

    Rectangle(double height, double width) {
        this.setHeight(height);
        this.setWidth(width);
    }

    private double getHeight() {
        return this.height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private double getWidth() {
        return this.width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    @Override
    void calculatePerimeter() {
        super.setPerimeter((this.getHeight() + this.getWidth()) * 2);
    }

    @Override
    void calculateArea() {
        super.setArea(this.getHeight() * this.getWidth());
    }
}
