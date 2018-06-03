import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Addable addCollection = new Add();
        AddableNRemovable addRemoveCollection = new AddNRemove();
        ListInterface myList = new MyList();

        final StringBuilder ADD_ADD_OUTPUT = new StringBuilder();
        final StringBuilder ADD_REMOVE_ADD_OUTPUT = new StringBuilder();
        final StringBuilder MY_LIST_ADD_OUTPUT = new StringBuilder();

        Arrays.stream(reader.readLine().split("\\s+"))
                .forEach(s -> {
                    ADD_ADD_OUTPUT.append(
                            addCollection.add(s)
                    )
                            .append(' ');

                    ADD_REMOVE_ADD_OUTPUT.append(
                            addRemoveCollection.add(s)
                    )
                            .append(' ');

                    MY_LIST_ADD_OUTPUT.append(
                            myList.add(s)
                    )
                            .append(' ');
                });

        int removals = Integer.parseInt(reader.readLine());

        final StringBuilder ADD_REMOVE_REMOVE_OUTPUT = new StringBuilder();
        final StringBuilder MY_LIST_REMOVE_OUTPUT = new StringBuilder();

        while (removals-- > 0) {
            ADD_REMOVE_REMOVE_OUTPUT.append(
                    addRemoveCollection.remove()
            )
                    .append(' ');

            MY_LIST_REMOVE_OUTPUT.append(
                    myList.remove()
            )
                    .append(' ');
        }

        StringBuilder result = new StringBuilder();
        result.append(ADD_ADD_OUTPUT.toString().trim()).append(System.lineSeparator());
        result.append(ADD_REMOVE_ADD_OUTPUT.toString().trim()).append(System.lineSeparator());
        result.append(MY_LIST_ADD_OUTPUT.toString().trim()).append(System.lineSeparator());
        result.append(ADD_REMOVE_REMOVE_OUTPUT.toString().trim()).append(System.lineSeparator());
        result.append(MY_LIST_REMOVE_OUTPUT.toString().trim());

        System.out.println(result);
    }
}