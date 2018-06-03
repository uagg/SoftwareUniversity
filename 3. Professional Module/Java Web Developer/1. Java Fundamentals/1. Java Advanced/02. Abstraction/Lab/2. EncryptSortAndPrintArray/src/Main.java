/*
Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
•	The code of each vowel multiplied by the string length
•	The code of each consonant divided by the string length
Sort the number sequence alphabetically and print it on the console.
On first line, you will always receive the number of strings you have to read.
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = input.nextLine();
        }
        //names = fillStringArray(n);
        int[] linesSorted = encryptArray(names, n);
        Arrays.sort(linesSorted);
        printArray(linesSorted);
    }

    private  static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.println(value);
        }
    }

    private static int[] encryptArray(String[] names, int n) {
        List<Character> vowels = new ArrayList<>();
        Collections.addAll(vowels, 'a','e','i','o','u');
        int[] result = new int[names.length];

        for (int i = 0; i < names.length; i++) {
            int sumForNameChars = 0;
            char[] nameCharacters = names[i].toCharArray();
            int charLength = nameCharacters.length;

            for (int j = 0; j < nameCharacters.length; j++) {
                char letter = nameCharacters[j];
                int letterAsciiValue = (int) letter;
                if (vowels.contains(letter)) {
                    sumForNameChars += letterAsciiValue * charLength;
                } else {
                    sumForNameChars += letterAsciiValue / charLength;
                }
            }

            result[i] = sumForNameChars;
        }

        return result;
    }

    private static String[] fillStringArray(int n) {
        Scanner nameInput = new Scanner(System.in);
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            String name = nameInput.nextLine();
            result[i] = name;
        }

        nameInput.close();
        return result;
    }
}
