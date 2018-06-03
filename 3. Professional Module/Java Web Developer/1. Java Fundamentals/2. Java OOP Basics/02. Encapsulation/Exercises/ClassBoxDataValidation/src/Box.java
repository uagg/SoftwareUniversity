public class Box {

    private Double length;
    private Double width;
    private Double height;

    public Box(Double length, Double width, Double height) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }

        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }

        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }

        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Double getLength() {
        return this.length;
    }

    public Double getWidth() {
        return this.width;
    }

    public Double getHeight() {
        return this.height;
    }

    public Double SurfaceArea() {
        Double area = 2 * this.getLength() * this.getWidth() + 2 * this.getLength() * this.getHeight() +
                2 * this.getWidth() * this.getHeight();
        return area;
    }

    public Double LateralSurface() {
        Double surface = 2 * this.getLength() * this.getHeight() + 2 * this.getWidth() * this.getHeight();
        return surface;
    }

    public Double Volume() {
        Double volume = this.getLength() * this.getWidth() * this.getHeight();
        return volume;
    }
}