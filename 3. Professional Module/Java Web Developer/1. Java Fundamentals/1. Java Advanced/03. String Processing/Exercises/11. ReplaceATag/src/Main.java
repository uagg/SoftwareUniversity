/*
You are given an HTML document given as a string on multiple lines. Write a program that replaces all the tags
<a href=…>…</a> with corresponding tags [URL href=…]…[/URL].
Read lines until you get the "END" command.
Note: a tag can start and end on different lines, but actual keywords like "href=" or the closing tag "</a>"
will never be split. For example, you will never get:
<a hr
ef="http://softuni.bg">SoftUni</
a>
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder input = new StringBuilder("");

        String line = "";
        while (!"END".equals(line = reader.readLine()))
            input.append(line).append(System.lineSeparator());

        Pattern pattern = Pattern.compile("<a(\\s+href=[^>]+)>([^<]+)</a>");

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            int startMatch = matcher.start();
            int endMatch = matcher.end();

            String replacement = createNewReplacement(matcher);
            input.replace(startMatch, endMatch, replacement);

            matcher = pattern.matcher(input);
        }

        System.out.println(input);
    }

    private static String createNewReplacement(Matcher matcher) {
        return "[URL" + matcher.group(1) + "]" + matcher.group(2) + "[/URL]";
    }
}