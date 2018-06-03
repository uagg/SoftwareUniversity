public abstract class Shape {

    private Double perimeter;
    private Double area;

    public Double getPerimeter() {
        return this.perimeter;
    }

    protected void setPerimeter(Double perimeterArea) {
        this.perimeter = perimeterArea;
    }

    public Double getArea() {
        return this.area;
    }

    protected void setArea(Double area) {
        this.area = area;
    }

    public abstract void calculatePerimeter();

    public abstract void calculateArea();
}