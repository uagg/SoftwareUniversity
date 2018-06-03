public class Rectangle implements Drawable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
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
