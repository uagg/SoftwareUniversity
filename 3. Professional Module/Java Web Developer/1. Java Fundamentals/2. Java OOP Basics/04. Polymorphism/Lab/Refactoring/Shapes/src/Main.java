import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        if (input.length == 1) {
            Double radius = Double.parseDouble(input[0]);
            Circle circle = new Circle(radius);
            circle.calculateArea();
            circle.calculatePerimeter();
            System.out.printf("%.2f", circle.getArea());
            System.out.printf("%.2f", circle.getPerimeter());
        } else if (input.length > 1) {
            Double height = Double.parseDouble(input[0]);
            Double width = Double.parseDouble(input[1]);
            Rectangle rectangle = new Rectangle(height, width);
            rectangle.calculateArea();
            rectangle.calculatePerimeter();
            System.out.println(rectangle.getArea());
            System.out.println(rectangle.getPerimeter());
        }
    }
}