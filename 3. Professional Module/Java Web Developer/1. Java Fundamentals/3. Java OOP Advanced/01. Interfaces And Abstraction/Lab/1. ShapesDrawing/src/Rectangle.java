public class Rectangle implements Drawable {

    private int width;
    private int height;

    public Rectangle (Integer width, Integer height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 0; i < this.height; i++) {
            System.out.print("*");
            for (int k = 1; k < this.width - 1; k++) {
                System.out.print(" ");
                if (i == 0 || i == (this.height - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            System.out.print("*");
            System.out.print("\n");
        }
    }
}
