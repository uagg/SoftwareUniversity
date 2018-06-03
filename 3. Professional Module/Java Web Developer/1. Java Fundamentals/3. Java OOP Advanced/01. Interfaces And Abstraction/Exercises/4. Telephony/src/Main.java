import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] phoneNumbers = sc.nextLine().split("\\s+");
        String[] urls = sc.nextLine().split("\\s+");

        Smartphone telephone = new Smartphone();

        for (String number : phoneNumbers) {
            System.out.println(telephone.call(number));
        }

        for (String url : urls) {
            System.out.println(telephone.browse(url));
        }
    }
}