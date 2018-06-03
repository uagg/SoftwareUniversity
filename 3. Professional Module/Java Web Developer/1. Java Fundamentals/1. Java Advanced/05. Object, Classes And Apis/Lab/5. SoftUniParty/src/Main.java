/*
There is a party in SoftUni. Many guests are invited and they are of two types - VIP and regular.
You will get a reservation list with all invited guests. When a guest comes, check if he/she exists in the reservation
list. All reservation numbers will consist of 8 chars. All VIP numbers start with a digit.
There will be 2 command lines:
•	"PARTY" – the party is on and guests start coming.
•	"END" – the party is over and no more guest will come.
Output
•	On the first line, print how many guests didn't show up
•	On the lines after that print their reservation numbers
•	First, print all VIP guests in order of their appearance and after that print the regular guests, again preserving
their initial order of appearance.
 */
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> setOfGuests = new TreeSet<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String guest = scanner.nextLine();

            if (!guest.equals("PARTY")) {
                setOfGuests.add(guest);
            } else {
                break;
            }
        }

        while (true) {
            String guest = scanner.nextLine();

            if (!guest.equals("END")) {
                setOfGuests.remove(guest);
            } else {
                break;
            }
        }

        System.out.println(setOfGuests.size());
        for (String guest : setOfGuests) {
            System.out.println(guest);
        }
    }
}
