/*
This problem is originally from the PHP Basics Exam (3 May 2015). You may check your solution here.
As you probably know Little John is the right hand of the famous English hero - Robin Hood. A little known fact is that
Little John can't handle Math very well. Before Robin Hood left to see Marry Ann, he asked John to count his hay of
arrows and send him an encrypted message containing the arrow's count. The message should be encrypted since it can be
intercepted by the Nottingham’s evil Sheriff. Your task is to help Little John before it is too late (0.10 sec).
You are given 4 input strings (hay). Those strings may or may not contain arrows. The arrows can be of different type as
follows:
● ">----->" – a small arrow
● ">>----->" – a medium arrow
● ">>>----->>" – a large arrow
Note that the body of each arrow will always be 5 dashes long. The difference between the arrows is in their tip and
tail. The given 3 types are the only ones you should count, the rest should be ignored (Robin Hood does not like them).
You should start searching the hays from the largest arrow type down to the smallest arrow type.
After you find the count of each arrow type you should concatenate them into one number in order: small, medium, large
arrow (even if the arrow count is 0). Then you convert the number in binary representation, reverse it and concatenate
it again with the initial binary representation of the number. You convert the final binary number again back to
decimal. This is the encrypted message you should send to Robin Hood.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Person> personList = new ArrayList<>();

        while (true) {
            String line = bf.readLine();
            if ("END".equalsIgnoreCase(line)) {
                break;
            }

            String[] tokens = line.split("\\s+");
            String name = tokens[0] + " " + tokens[1];
            Integer group = Integer.valueOf(tokens[2]);

            Person person = new Person(name, group);
            personList.add(person);
        }

        Map<Integer, List<Person>> result = personList.stream()
                .collect(Collectors.groupingBy(Person::getGroup));

        personList.stream()
                .collect(Collectors.groupingBy(Person::getGroup))
                .forEach((key, value) -> {
                    System.out.printf("%d - ", key);
                    System.out.println(value
                            .stream()
                            .map(Person::getName)
                            .map(String::valueOf)
                            .collect(Collectors.joining(", ")));
                });
    }
}