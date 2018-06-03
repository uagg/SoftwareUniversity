import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CustomLinkedList<String> list = new CustomLinkedList<>();

        int count = Integer.parseInt(reader.readLine());

        while (count-- > 0) {
            String[] cmdArgs = reader.readLine().split("\\s+");

            String cmd = cmdArgs[0];
            String val = cmdArgs[1];

            switch (cmd) {
                case "Add":
                    list.add(val);
                    break;
                case "Remove":
                    list.remove(val);
                    break;
            }
        }

        System.out.println(list.getSize());

        List<String> output = new ArrayList<>();

        for (String element : list) {
            output.add(element);
        }

        System.out.println(String.join(" ", output));
    }
}