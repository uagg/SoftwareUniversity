/*
You are given a keys string and a text string. Write a program that finds the start key and the end key from the keys
string and then applies them to the text string.
The start key will always stay at the beginning of the keys string. It can contain only letters and underscore and ends
just before the first found digit.
The end key will always stay at the end of the keys string. It can contain only letters and underscore and starts
just after the last found digit.
Print at the console the sum of all values (only integer and floating-point numbers with dot as a separator are
considered valid) in the text string, between a start key and an end key. If the value is 0 then print “The total
value is: nothing”. If no start key or no end key is found, then print “A key is missing”.
Input
The input will be read from the console. The first line will hold the keys string and the second line will hold
the text to search.
Output
The output should hold the result text, printed in an HTML paragraph.
If the resulting sum is a floating-point number, format it to the second digit after the decimal point and don’t
print any numbers after the decimal point, if the sum is an integer.
Constraints
•	The keys string and text string will hold only ASCII characters (no Unicode).
•	Allowed working time: 0.1 seconds. Allowed memory: 16 MB.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String keyString = reader.readLine();
        String text = reader.readLine();

        Pattern keysPattern = Pattern.compile("^([a-zA-Z_]+(?=\\d)).*?((?<=\\d)[a-zA-Z_]+)$");
        Matcher keysMatcher = keysPattern.matcher(keyString);

        if (keysMatcher.matches()) {
            String startKey = keysMatcher.group(1);
            String endKey = keysMatcher.group(2);

            Pattern targetPattern = Pattern.compile(startKey + "([\\d.]+?)" + endKey);
            Matcher targetMatcher = targetPattern.matcher(text);

            double sum = 0.0;
            while (targetMatcher.find()) {
                try {
                    double num = Double.parseDouble(targetMatcher.group(1));
                    sum += num;
                } catch (Exception e) {}
            }

            String value = sum > 0 ? new DecimalFormat("#.##").format(sum) : "nothing";

            System.out.printf("<p>The total value is: <em>%s</em></p>", value);
        } else
            System.out.println("<p>A key is missing</p>");
    }
}