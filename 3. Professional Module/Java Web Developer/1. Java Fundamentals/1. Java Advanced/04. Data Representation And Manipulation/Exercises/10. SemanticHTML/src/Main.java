/*
You are given an HTML code, written in the old non-semantic style using tags like <div id="header">,
<div class="section">, etc. Your task is to write a program that converts this HTML to semantic HTML by changing tags
like <div id="header"> to their semantic equivalent like <header>.
The non-semantic tags that should be converted are always <div>s and have either id or class with one of the following
values: "main", "header", "nav", "article", "section", "aside" or "footer". Their corresponding closing tags are always
followed by a comment like <!-- header -->, <!-- nav -->, etc. staying at the same line, after the tag.
Input
The input will be read from the console. It will contain a variable number of lines and will end with the keyword "END".
Output
The output is the semantic version of the input HTML. In all converted tags you should replace multiple spaces
(like <header      style="color:red">) with a single space and remove excessive spaces at the end (like <footer      >).
See the examples.
Constraints
•	Each line from the input holds either an HTML opening tag or an HTML closing tag or HTML text content.
•	There will be no tags that span several lines and no lines that hold multiple tags.
•	Attributes values will always be enclosed in double quotes ".
•	Tags will never have id and class at the same time.
•	The HTML will be valid. Opening and closing tags will match correctly.
•	Whitespace may occur between attribute names, values and around comments (see the examples).
•	Allowed working time: 0.1 seconds. Allowed memory: 16 MB.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String openTag = "(?<replace><div).+(?<remove>(id|class) *?= *?\"(?<newName>\\w+)\").+>?";
        String closeTag = "<\\/div>[\\s]*(?<delete><!--[\\s]*?(?<word>\\w+)[\\s]*?-->)";
        Pattern closeTagPattern = Pattern.compile(closeTag);
        Pattern openTagPattern = Pattern.compile(openTag);
        String[] validTags = {"main", "header", "nav", "article", "section", "aside", "footer"};

        while (true) {
            String input = scan.readLine();
            if ("END".equals(input)) {
                break;
            }
            Matcher openTagMatcher = openTagPattern.matcher(input);
            Matcher closeTagMatcher = closeTagPattern.matcher(input);
            if (openTagMatcher.find() && Arrays.asList(validTags).contains(openTagMatcher.group("newName"))) {
                String result = openTagMatcher.group()
                        .replace(openTagMatcher.group("replace"), "<" + openTagMatcher.group("newName"))
                        .replace(openTagMatcher.group("remove"), "");
                System.out.println(result.replaceAll(" +>", ">").replaceAll(" +", " "));
            } else if (closeTagMatcher.find() && Arrays.asList(validTags).contains(closeTagMatcher.group("word"))) {
                String result = closeTagMatcher.group()
                        .replace("div", closeTagMatcher.group("word"))
                        .replace(closeTagMatcher.group("delete"), "");
                System.out.println(result.replaceAll(" +", ""));
            } else {
                System.out.println(input);
            }
        }
    }
}