/*
You are given a string, holding ASCII characters. Find all name -> phone number pairs, format them and print them in
an ordered list as list items.
The name should be at least one letter long, can contain only letters and should always start with an uppercase letter.
The phone number should be at least two digits long, should start and end with a digit (optionally, there might be a
“+” in front) and might contain the following symbols in it: “(“, “)”, “/”, “.”, “-”, “ “ (left and right bracket,
slash, dot, dash and whitespace).
Between a name and the phone number there might be any number of symbols, other than letters and “+”.
Between the name -> phone number pairs there might be any number of ASCII symbols.
The output format should be <b>[name]:</b> [phone number] (there is one space between the name and the phone number).
Clear any characters other than digits and “+” from the number when printing the output.
Input
The input will be read from the console. It will consist of several lines holding the input string. The command "END"
denotes the end of input.
Output
The output should hold the resulting ordered list (on a single line), or a single paragraph, holding “No matches!”
Constraints
•	The numbers string will hold only ASCII characters (no Unicode).
•	Allowed working time: 0.1 seconds. Allowed memory: 16 MB.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String regex = "([A-Z](?:[a-zA-Z]+)?)([^a-zA-Z+]*[+]?[0-9]+[()\\/.\\- ]*[0-9]+(?:[()\\/.\\- ]+[0-9]+)*)";
        Map<String, String> phoneBook = new LinkedHashMap<>();
        Pattern pattern = Pattern.compile(regex);
        StringBuilder text = new StringBuilder("");

        while (true){
            String input = scan.readLine();
            if ("END".equals(input)){break;}
            text.append(input);
        }

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            String name = matcher.group(1);
            String phone = matcher.group(2);
            StringBuilder filteredPhone = new StringBuilder();

            for (int i = 0; i < phone.length(); i++) {
                try{
                    if(phone.charAt(i) == '+'){
                        filteredPhone.append("+");
                    }
                    byte digit = Byte.parseByte(phone.charAt(i)+"");
                    filteredPhone.append(digit);
                } catch (Exception ignored){}
            }

            phoneBook.put(name, filteredPhone.toString());
        }

        if (phoneBook.isEmpty()){
            System.out.println("<p>No matches!</p>");
        } else {
            StringBuilder result = new StringBuilder("<ol>");

            for (String s : phoneBook.keySet()) {
                result.append("<li><b>").append(s).append(":</b> ").append(phoneBook.get(s)).append("</li>");
            }

            result.append("</ol>");
            System.out.println(result);
        }
    }
}