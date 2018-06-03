import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyStack<Integer> myStack = new MyStack<>();

        String input = sc.nextLine();

        while(! "END".equals(input)) {
            input = input.replaceAll(",", "");
            String[] cmdArgs = input.split("\\s+");
            String cmd = cmdArgs[0];

            switch (cmd) {
                case "Pop":
                    try {
                        myStack.pop();
                    } catch (IllegalStateException ise) {
                        System.out.println(ise.getMessage());
                    }
                    break;
                case "Push":
                    Integer[] elements = Stream.of(cmdArgs)
                            .skip(1)
                            .mapToInt(Integer::parseInt)
                            .boxed()
                            .toArray(Integer[]::new);
                    myStack.push(elements);
                    break;
            }

            input = sc.nextLine();
        }

        for (Integer i : myStack) {
            System.out.println(i);
        }

        for (Integer i : myStack) {
            System.out.println(i);
        }
    }
}
