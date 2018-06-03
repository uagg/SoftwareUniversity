/*
Doctor T. likes to communicate with encrypted messages with his lackeys. But the lackeys are relatively stupid, so you
need to help them understand the Doctor’s messages, by decrypting his encrypted data.
You have been tasked to decrypt several messages. You will be given the messages as several input lines. You must read
and decrypt messages until you receive the command “Ascend”.
When you receive a given message you must decrypt it and print it immediately. The messages have several encoded strings
in them, which you must find. The encoded string consist of – a single comma (,) or an underscore (_), a sequence of
English Alphabet letters, and a digit at the end of it. Examples: “,asd9”, “_z8”, “,xzc9“.
The decoding of a message is done by adding or subtracting the digit in it, from the ASCII code of every character in
the sequence of letters. If the front character is a comma (,) you add the digit to the ASCII codes of the characters,
if it’s an underscore (_), you subtract it.
When you find an encoded string, you must “memorize” it. In other words, you find the encoded string “_qlfh5”,
and decode it – it results in “lgac”. If you find the same encoded string (_qlfh5), again, in a message afterwards, you
must replace it with the decoded value corresponding to it (lgac), BEFORE beginning to decode the message itself.
Example: “abcdefg,_qlfh52hijklmn” = “abcdefg,lgac2hijklmn” = “abcdefgnicehijklm”.
You know that “_qlfh5” is “lgac”, so the message would turn into “abcedfg,lgac2hijklmn” which after decoding turns into
“abcdefgnicehijklm”.
Input
•	The input comes in the form of input lines containing the encoded messages.
•	When you receive the command “Ascend” the input sequence ends.
Output
•	You must print every message, immediately after you’ve decoded it.
Constrains
•	The input lines may consist of any ASCII character.
•	Upon replacing with memorized patterns, you must do it in the order in which you’ve found the patterns.

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("(,|_)([a-zA-Z]+)(\\d)");
        ArrayList<String> text = new ArrayList<>();
        LinkedHashMap<String, String> memos = new LinkedHashMap<>();

        String commandLine = reader.readLine();

        while (!commandLine.equals("Ascend")) {
            text.add(commandLine);
            commandLine = reader.readLine();
        }

        for (int i = 0; i < text.size(); i++) {
            for (String m : memos.keySet()) {
                text.set(i, text.get(i).replaceAll(m, memos.get(m)));
            }
            Matcher matcher = pattern.matcher(text.get(i));
            while (matcher.find()) {
                StringBuilder replacement = new StringBuilder("");
                if (matcher.group(1).equals(",")) {
                    for (Character ch : matcher.group(2).toCharArray()) {
                        replacement.append((char) ((int) ch + Integer.parseInt(matcher.group(3))));
                    }
                } else {
                    for (Character ch : matcher.group(2).toCharArray()) {
                        replacement.append((char) ((int) ch - Integer.parseInt(matcher.group(3))));
                    }
                }
                text.set(i, text.get(i).replace(matcher.group(), replacement.toString()));
                memos.put(matcher.group(), replacement.toString());
            }
            System.out.println(text.get(i));
        }
    }
}