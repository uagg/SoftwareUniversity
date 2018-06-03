/*
Write a program that reads 3 points in the plane (with integer x and y as coordinates), calculates and prints the area
of the triangle composed by these 3 points. Round the result to a whole number. In case the three points do not form a
triangle, print "0" as result.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aSides = input.nextLine();
        String[] pointA = aSides.split(" ");
        String bSides = input.nextLine();
        String[] pointB = bSides.split(" ");
        String cSides = input.nextLine();
        String[] pointC = cSides.split(" ");
        int ax = Integer.parseInt(pointA[0]);
        int ay = Integer.parseInt(pointA[1]);
        int bx = Integer.parseInt(pointB[0]);
        int by = Integer.parseInt(pointB[1]);
        int cx = Integer.parseInt(pointC[0]);
        int cy = Integer.parseInt(pointC[1]);

        int area = (ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2;
        area = Math.abs(area);

        System.out.println(area);
    }
}
