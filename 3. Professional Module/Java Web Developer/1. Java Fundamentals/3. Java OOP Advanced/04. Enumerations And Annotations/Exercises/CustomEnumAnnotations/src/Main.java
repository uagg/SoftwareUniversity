import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String classType = sc.nextLine();

        Class<?> cardClass = null;

        switch (classType) {
            case "Rank":
                cardClass = CardRank.class;
                break;
            case "Suit":
                cardClass = CardSuit.class;
                break;
        }

        Enumeration annotation = cardClass.getAnnotation(Enumeration.class);

        System.out.println(String.format("Type = Enumeration, Description = %s",
                annotation.description()));
    }
}