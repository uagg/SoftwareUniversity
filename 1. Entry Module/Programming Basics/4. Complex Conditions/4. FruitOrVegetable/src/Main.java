/*
Да се напише програма, която въвежда име на продукт и проверява дали е плод или зеленчук.
•	Плодовете "fruit" са banana, apple, kiwi, cherry, lemon и grapes
•	Зеленчуците "vegetable" са tomato, cucumber, pepper и carrot
•	Всички останали са "unknown"
Да се изведе „fruit“, „vegetable“ или „unknown“ според въведения продукт.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String whatIsIt = scanner.nextLine();
        whatIsIt = whatIsIt.toLowerCase();
        if(("banana".equals(whatIsIt)) || ("apple".equals(whatIsIt)) || ("kiwi".equals(whatIsIt)) ||
                ("cherry".equals(whatIsIt)) || ("lemon".equals(whatIsIt)) || "grapes".equals(whatIsIt)) {
            System.out.println("fruit");
        } else if(("tomato".equals(whatIsIt)) || ("cucumber".equals(whatIsIt)) || ("pepper".equals(whatIsIt)) ||
                ("carrot".equals(whatIsIt))) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
}