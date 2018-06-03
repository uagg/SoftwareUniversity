/*
Create a class called "Cube". It should have properties for color, width, height and depth.
Create an instance of the class with the following values:
•	Color: "green"
•	Width: 15.3
•	Height: 12.4
•	Depth: 3.0
Serialize and deserilalize the instance created. When saved to a file the object should look like something like the
example below.
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.color = "green";
        cube.width = 15.3d;
        cube.height = 12.4d;
        cube.dept = 3d;

        String path = "D:\\save.txt";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(cube);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
