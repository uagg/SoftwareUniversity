import java.util.Scanner;

public class Pr06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letterStart = scanner.nextLine().charAt(0);
        char letterEnd = scanner.nextLine().charAt(0);
        char letterSkip = scanner.nextLine().charAt(0);
        int count = 0;
        StringBuilder output = new StringBuilder();
        for (char first = letterStart; first <= letterEnd; first++) {
            if(first == letterSkip) {
                continue;
            }
            for (char mid = letterStart; mid <= letterEnd; mid++) {
                if(mid == letterSkip) {
                    continue;
                }
                for (char last = letterStart; last <= letterEnd; last++) {
                    if(last == letterSkip) {
                        continue;
                    }
                    output.append(first);
                    output.append(mid);
                    output.append(last);
                    output.append(" ");
                    count++;
                }
            }
        }
        output.append(count);
        System.out.println(output);
    }
}