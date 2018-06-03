public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if(length < 1) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if(width < 1) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if(height < 1) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public Double surfaceArea() {
        Double area = 2 * this.length * this.width + 2 * this.length * this.height +
                2 * this.width * this.height;
        return area;
    }

    public Double lateralSurfaceArea() {
        Double surface = 2 * this.length * this.height + 2 * this.width * this.height;
        return surface;
    }

    public Double volume() {
        Double volume = this.length * this.width * this.height;
        return volume;
    }
}
