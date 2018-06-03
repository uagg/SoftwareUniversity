import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Person person;
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] personInfo = sc.nextLine().split(" ");
            String personName = personInfo[0];
            int personAge = Integer.parseInt(personInfo[1]);
            if (personAge > 30) {
                person = new Person(personName, personAge);
                people.add(person);
            }
        }

        Collections.sort(people);
        people.forEach(p -> System.out.printf("%s - %d%n", p.getName(), p.getAge()));
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return this.getName().compareTo(p.getName());
    }
}