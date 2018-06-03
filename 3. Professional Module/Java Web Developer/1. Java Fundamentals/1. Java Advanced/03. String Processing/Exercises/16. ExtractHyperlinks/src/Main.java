/*
Write a program to extract all hyperlinks (<href=…>) from a given text. The text comes from the console on a variable
number of lines and ends with the command "END". Print at the console the href values in the text.
The input text is standard HTML code. It may hold many tags and can be formatted in many different forms (with or
without whitespace). The <a> elements may have many attributes, not only href. You should extract only the values
of the href attributes of all <a> elements.
Input
The input data comes from the console. It ends when the "END" command is received.
Output
Print at the console the href values in the text, each at a separate line, in the order they come from the input.
Constraints
•	The input will be well formed HTML fragment (all tags and attributes will be correctly closed).
•	Attribute values will never hold tags and hyperlinks, e.g. "<img alt='<a href="hello">' />" is invalid.
•	Commented links are also extracted.
•	The number of input lines will be in the range [1 ... 100].
•	Allowed working time: 0.1 seconds. Allowed memory: 16 MB.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder html = new StringBuilder();

        String input;
        while (!"END".equals(input = reader.readLine())) {
            html.append(input).append(' ');
        }

        Pattern aTagPattern = Pattern.compile("<a((?:.|$|\\s)*?)>(?:.|$|\\s)*?</a>");
        Matcher aTagMatcher = aTagPattern.matcher(html);

        ArrayList<String> aTagsContent = new ArrayList<>();
        while (aTagMatcher.find()) {
            aTagsContent.add(aTagMatcher.group(1).trim());
        }

        StringBuilder output = new StringBuilder();
        Pattern hrefPattern = Pattern.compile("href\\s*=\\s*(\\s|'|\")(.*?)\\1");
        for (String aTagContent : aTagsContent) {
            Matcher hrefMatcher = hrefPattern.matcher(aTagContent);
            if (hrefMatcher.find())
                output.append(hrefMatcher.group(2)).append(System.lineSeparator());
        }

        System.out.println(output);
    }
}