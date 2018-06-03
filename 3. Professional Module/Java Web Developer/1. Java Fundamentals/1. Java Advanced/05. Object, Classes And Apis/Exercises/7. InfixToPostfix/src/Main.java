/*
Mathematical expressions are written in an infix notations, for example "5 / ( 3 + 2 )". However, this kind of notation
is not efficient for computer processing, as you first need to evaluate the expression inside the brackets, so there is
a lot of back and forth movement. A more suitable approach is to convert it in the so-called postfix notations (also
called Reverse Polish Notation), in which the expression is evaluated from left to right, for example "3 2 + 5 /".
Implement an algorithm that converts the mathematical expression from infix notation into a postfix notation.
Use the famous Shunting-yard algorithm.
Input
•	You will receive an expression on a single line, consisting of tokens
•	Tokens could be numbers 0-9, variables a-z, operators +, -, *, / and brackets ( or )
•	Each token is separated by exactly one space
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] expression = bf.readLine().split(" ");
        Deque<String> output = new ArrayDeque<>(); //queue
        Deque<String> operators = new ArrayDeque<>(); //stack
        Map<String, Integer> priorites = new HashMap<>();
        priorites.put("*", 3);
        priorites.put("/", 3);
        priorites.put("+", 2);
        priorites.put("-", 2);
        priorites.put("(", 1);

        for (String token : expression) {
            try {
                double num = Double.parseDouble(token);
                output.add(token);
            } catch (Exception e) {
                if (Character.isLetter(token.charAt(0))) {
                    output.add(token);
                } else {
                    if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                        if (operators.isEmpty()) {
                            operators.push(token);
                            continue;
                        } else {
                            while (!operators.isEmpty() && priorites.get(operators.peek()) >= priorites.get(token)) {
                                String operatorOnTopOfStack = operators.pop();
                                output.add(operatorOnTopOfStack);
                            }
                        }
                        operators.push(token);
                    } else if (token.equals("(")) {
                        operators.push(token);
                    } else if (token.equals(")")) {
                        while (!operators.peek().equals("(")) {
                            String operatorOnTopOfStack = operators.pop();
                            output.add(operatorOnTopOfStack);
                        }
                        operators.pop();
                    }
                }
            }
        }

        while (!operators.isEmpty()) {
            String operatorOnTopOfStack = operators.pop();
            output.add(operatorOnTopOfStack);
        }

        while (output.size() > 0) {
            System.out.print(output.pop() + " ");
        }

        System.out.println();
    }
}