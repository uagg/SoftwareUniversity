import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double length = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        try {
            Box box = new Box(length, width, height);
            Double sa = box.SurfaceArea();
            Double ls = box.LateralSurface();
            Double v = box.Volume();

            System.out.printf("Surface Area - %.2f%n", sa);
            System.out.printf("Lateral Surface Area - %.2f%n", ls);
            System.out.printf("Volume - %.2f%n", v);

        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}