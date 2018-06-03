/*
You are part of the back-end development team of the next Facebook. You are given a line of usernames,
between one of the following symbols: space, “/”, “\”, “(“, “)”. First you have to export all valid usernames.
A valid username starts with a letter and can contain only letters, digits and “_”. It cannot be less than 3 or
more than 25 symbols long. Your task is to sum the length of every 2 consecutive valid usernames and print on
the console the 2 valid usernames with biggest sum of their lengths, each on a separate line.
Input
The input comes from the console. One line will hold all the data. It will hold usernames, divided by
he symbols: space, “/”, “\”, “(“, “)”.
The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
Print at the console the 2 consecutive valid usernames with the biggest sum of their lengths each on a separate line.
If there are 2 or more couples of usernames with the same sum of their lengths, print he left most.
Constraints
•	The input line will hold characters in the range [0 … 9999].
•	The usernames should start with a letter and can contain only letters, digits and “_”.
•	The username cannot be less than 3 or more than 25 symbols long.
•	Time limit: 0.5 sec. Memory limit: 16 MB.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("[ /\\\\()]");

        Pattern validUsernamePattern = Pattern.compile("^[a-zA-Z]\\w{2,24}$");

        List<String> validUsernames = new ArrayList<>();
        for (String inputToken : input) {
            Matcher usernameMatcher = validUsernamePattern.matcher(inputToken);
            while (usernameMatcher.find())
                validUsernames.add(usernameMatcher.group());
        }

        LinkedHashMap<String, Integer> usernameSums = new LinkedHashMap<>();

        int firstUserNameInd = 0;
        int secondUserNameInd = 0;
        int biggestSum = Integer.MIN_VALUE;

        for (int i = 0; i < validUsernames.size() - 1; i++) {
            int firstUserNameLength = validUsernames.get(i).length();
            int secondUserNameLength = validUsernames.get(i + 1).length();

            int tempSum = firstUserNameLength + secondUserNameLength;
            if (tempSum > biggestSum) {
                firstUserNameInd = i;
                secondUserNameInd = i + 1;
                biggestSum = tempSum;
            }
        }

        System.out.printf("%s%n%s%n", validUsernames.get(firstUserNameInd), validUsernames.get(secondUserNameInd));
    }
}
