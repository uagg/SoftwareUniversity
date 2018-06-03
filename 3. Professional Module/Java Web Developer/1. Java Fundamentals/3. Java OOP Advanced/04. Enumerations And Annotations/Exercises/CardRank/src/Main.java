public class Main {
    public static void main(String[] args) {
        CardTypes[] ct = CardTypes.values();

        System.out.println("Card Ranks:");

        for (CardTypes type : ct) {
            System.out.printf("Ordinal value: %s; Name value: %s%n", type.ordinal(), type.name());
        }
    }
}
