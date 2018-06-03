/*
Write a program that receives some info from the console about people and their phone numbers. Each entry has just one
name and one number. If you receive a name that already exists in the phonebook, simply update its number.
After filling this simple phonebook, upon receiving the command "search", perform a search of a contact by name and
print its details in format "{name} -> {number}".
In case the contact isn't found, print "Contact {name} does not exist."
The output will end with a “Stop” command.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> myPhonebook = new HashMap<>();

        readInput(bf, myPhonebook);
        searchInPhoneBook(bf, myPhonebook);
    }

    private static void searchInPhoneBook(BufferedReader bf, Map<String, String> myPhonebook) throws IOException {
        while (true) {
            String name = bf.readLine();

            if ("Stop".equalsIgnoreCase(name)) {
                break;
            }

            if (myPhonebook.containsKey(name)) {
                System.out.printf("%s -> %s%n", name, myPhonebook.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }
        }
    }

    private static void readInput(BufferedReader bf, Map<String, String> myPhonebook) throws IOException {
        while (true) {
            String[] line = bf.readLine().split("-");

            if ("search".equalsIgnoreCase(line[0])) {
                break;
            }

            String name = line[0];
            String phoneNumber = line[1];

            myPhonebook.put(name, phoneNumber);
        }
    }
}