/*
Write a program that parses an URL address given in the format: [protocol]://[server]/[resource]
and extracts from it the [protocol], [server] and [resource] elements.
If the URL is not in a correct format, print “Invalid URL” on the console.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLine = input.nextLine();
        String[] reminder = inputLine.split("://");
        String protocol = reminder[0];

        int index = 0;
        boolean cont = true;
        int counter = 0;

        while (cont) {
            int setIndex = inputLine.indexOf("://", index);

            if (setIndex != -1) {
                index = setIndex + 1;
                counter++;
            } else {
                cont = false;
            }
        }

        if (counter < 2) {
            int serverEndIndex = reminder[1].indexOf("/");
            String server = reminder[1].substring(0, serverEndIndex);
            String resource = reminder[1].substring(serverEndIndex + 1, reminder[1].length());
            System.out.printf("Protocol = %s\n", protocol);
            System.out.printf("Server = %s\n", server);
            System.out.printf("Resources = %s\n", resource);
        } else {
            System.out.println("Invalid URL");
        }
    }
}
