/*
You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list.
One of the integers is missing in the list. Find the missing integer.
You will get an integer n on the first line and n-1 integers, separated by a space and a comma, on the second line;
 */
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] area = sc.nextLine().split(", ");
        Set<Integer> set = new TreeSet<>();

        for(String anArea : area) {
            set.add(Integer.parseInt(anArea));
        }

        boolean searched = true;
        Integer missingInteger = 0;

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missingInteger = i;
                searched = false;
            }
        }

        System.out.println(missingInteger);
    }
}