/*
Write a method that takes as input two strings, and returns true  if they are exchangeable.
Exchangeable are words, where the characters in the first string can be replaced to get the second string.
 Example: "egg" and "add" are exchangeable, but "aabccbb" and "nnoppzz" are not. (First 'b' corresponds to 'o',
 but then it also corresponds to 'z').
The two words may not have the same length, if such is the case they are exchangeable only if the longer one
doesn't have more types of characters then the shorter one ("Clint" and "Eastwaat" are exchangeable because
'a' and 't' are already mapped as 'l' and 'n', but "Clint" and "Eastwood" aren't exchangeable because 'o' and 'd'
are not contained in "Clint").
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");
        char[] firstWord = input[0].toCharArray();
        char[] secondWord = input[1].toCharArray();

        Map<Character, Character> magicWords = new HashMap<>();

        if (firstWord.length > secondWord.length) {

            for (int i = 0; i < secondWord.length; i++) {

                if (!magicWords.containsKey(firstWord[i])) {
                    if (!magicWords.containsValue(secondWord[i])) {
                        magicWords.put(firstWord[i], secondWord[i]);
                    } else {
                        System.out.println(false);
                        return;
                    }
                } else if (magicWords.get(firstWord[i]) != secondWord[i]) {
                    System.out.println(false);
                    return;
                }
            }

            for (int i = secondWord.length; i < firstWord.length; i++) {
                if (!magicWords.containsKey(firstWord[i])) {
                    System.out.println(false);
                    return;
                }
            }
        } else {
            for (int i = 0; i < firstWord.length; i++) {

                if (!magicWords.containsKey(firstWord[i])) {
                    if (!magicWords.containsValue(secondWord[i])) {
                        magicWords.put(firstWord[i], secondWord[i]);
                    } else {
                        System.out.println(false);
                        return;
                    }
                } else if (magicWords.get(firstWord[i]) != secondWord[i]) {
                    System.out.println(false);
                    return;
                }
            }

            for (int i = firstWord.length; i < secondWord.length; i++) {
                if (!magicWords.containsValue(secondWord[i])) {
                    System.out.println(false);
                    return;
                }

            }
        }
        System.out.println(true);
    }
}