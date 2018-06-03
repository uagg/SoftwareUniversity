import java.util.stream.Stream;

public class CommandInterpreter {
    // Delimiter
    private static final String DELIMITER = "\\s+";

    // Commands
    private static final String CREATE = "Create";
    private static final String MOVE = "Move";
    private static final String PRINT = "Print";
    private static final String HASNEXT = "HasNext";
    private static final String PRINTALL = "PrintAll";

    private ListyIterator li;

    public void readCommand(String input) {
        String[] args = input.split(DELIMITER);
        String cmd = args[0];

        switch (cmd) {
            case CREATE:
                this.executeCreate(args);
                break;
            case MOVE:
                this.executeMove();
                break;
            case PRINT:
                this.executePrint();
                break;
            case HASNEXT:
                this.executeHasNext();
                break;
            case PRINTALL:
                this.executePrintAll();
                break;
        }
    }

    private void executePrintAll() {
        StringBuilder sb = new StringBuilder();
        for (String s : li) {
            sb.append(s).append(' ');
        }
        System.out.println(sb.toString().trim());
    }

    private void executeHasNext() {
        boolean result = this.li.hasNext();
        System.out.println(result);
    }

    private void executePrint() {
        try {
            this.li.print();
        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
        }
    }

    private void executeMove() {
        boolean result = this.li.move();
        System.out.println(result);
    }

    private void executeCreate(String[] args) {
        String[] items = Stream.of(args).skip(1).toArray(String[]::new);
        this.li = new ListyIterator(items);
    }
}
