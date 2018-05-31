import java.util.Scanner;

public class Pr05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int topDotCount = ((n * 4 + 1) - 3) / 2;
        String topDots = repeatString(".", topDotCount);
        System.out.println(topDots + "/|\\" + topDots);
        System.out.println(topDots + "\\|/" + topDots);
        for (int i = 0; i < 2 * n; i++) {
            String midDots = repeatString(".", topDotCount);
            String dashes = repeatString("-", i);
            System.out.printf("%s*%s*%s*%s\n", midDots, dashes, dashes, midDots);
            topDotCount--;
        }
        String bottomStars = repeatString("*", 4 * n + 1);
        String bottomMid = repeatString("*.", 2 * n);
        System.out.println(bottomStars);
        System.out.println(bottomMid + "*");
        System.out.println(bottomStars);

    }

    static String repeatString(String value, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += value;
        }
        return result;
    }
}
