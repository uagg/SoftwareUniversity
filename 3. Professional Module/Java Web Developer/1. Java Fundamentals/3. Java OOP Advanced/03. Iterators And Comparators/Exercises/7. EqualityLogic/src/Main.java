import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Person> hashPeople = new HashSet<>();
        Set<Person> treePeople = new TreeSet<>();

        int count = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count; i++) {
            String[] tokens = sc.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person p = new Person(name, age);
            hashPeople.add(p);
            treePeople.add(p);
        }

        System.out.println(hashPeople.size());
        System.out.println(treePeople.size());
    }
}
