/*
Write a program to extract all email addresses from a given text. The text comes from a single input line.
Print the emails on the console, each on a separate line. Emails are considered to be in format <user>@<host>, where:
•	<user> is a sequence of letters and digits, where '.', '-' and '_' can appear between them.
o	Valid users: "stephan", "mike03", "s.johnson", "st_steward", "softuni-bulgaria", "12345".
o	Invalid users: ''--123", ".....", "nakov_-", "_steve", ".info".
•	<host> is a sequence of at least two words, separated by dots '.'. Each word is sequence of letters and can have
hyphens '-' between the letters.
o	Valid hosts: "softuni.bg", "software-university.com", "intoprogramming.info", "mail.softuni.org".
o	Invalid hosts: "helloworld", ".unknown.soft.", "invalid-host-", "invalid-".
Emails should start with either a space (' ') or with line start (regex: ^) and end with dot ('.'), comma (','),
space  (' ') or line end (regex: $).
•	Valid emails: info@softuni-bulgaria.org, kiki@hotmail.co.uk, no-reply@github.com, s.peterson@mail.uu.net,
info-bg@software-university.software.academy.
•	Invalid emails: --123@gmail.com, …@mail.bg, .info@info.info, _steve@yahoo.cn, mike@helloworld, mike@.unknown.soft.,
s.johnson@invalid-.
Read lines until you get the "end" command.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern =
                Pattern.compile
                        ("(?<=^| )([a-zA-Z]+[\\w.-]*[^.-_])@([a-zA-Z]+[a-zA-Z-]*(?:\\.[a-zA-Z]+[a-zA-Z-]*)+)(?= |\\.|,|$)");

        StringBuilder output = new StringBuilder();

        String input;
        while (!"end".equals(input = reader.readLine())) {
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                output.append(matcher.group(0)).append(System.lineSeparator());
            }
        }

        System.out.print(output);
    }
}