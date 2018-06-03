public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private double getLength() {
        return length;
    }

    private void setLength(double length) {
        this.length = length;
    }

    private double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return  2 * this.getWidth() * this.getLength() + 2 * this.getLength() * this.getHeight() + 2 * this.getWidth() * this.getHeight();
    }

    public double lateralSurfaceArea () {
        return 2 * this.getLength() * this.getHeight() + 2 * this.getWidth() * this.getHeight();
    }

    public double volume() {
        return this.getHeight() * this.getLength() * this.getWidth();
    }
}
