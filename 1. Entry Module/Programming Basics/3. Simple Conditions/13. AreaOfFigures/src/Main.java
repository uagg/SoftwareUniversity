/*
Да се напише програма, която въвежда размерите на геометрична фигура и пресмята лицето й. Фигурите са четири вида:
квадрат (square), правоъгълник (rectangle), кръг (circle) и триъгълник (triangle).
На първия ред на входа се чете вида на фигурата (square, rectangle, circle или triangle).
Ако фигурата е квадрат, на следващия ред се чете едно число – дължина на страната му.
Ако фигурата е правоъгълник, на следващите два реда четат две числа – дължините на страните му.
Ако фигурата е кръг, на следващия ред чете едно число – радиусът на кръга. Ако фигурата е триъгълник,
на следващите два реда четат две числа – дължината на страната му и дължината на височината към нея.
Резултатът да се закръгли до 3 цифри след десетичната точка.
Подсказка: използвайте серия от if-else-if-else-… конструкции, за да обработите 4-те вида фигури.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if(figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double area = a*a;
            System.out.printf("%.3f", area);
        }
        if(figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = a * b;
            System.out.printf("%.3f", area);
        }
        if(figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * radius * radius;
            System.out.printf("%.3f", area);
        }
        if(figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double area = (a * h) / 2;
            System.out.printf("%.3f", area);
        }
    }
}