public class commandInterpreter {

    private static final String DELIMITER = "\\s+";
    private static final int CMD = 0;
    private static final int INT_FIRST_PARAMETER = 1;
    private static final int INT_SECOND_PARAMETER = 2;

    private CustomList<String> list;

    public commandInterpreter(CustomList<String> currentList) {
        this.list = currentList;
    }

    public void readCommand(String line) {
        String[] args = line.split(DELIMITER);
        String cmd = args[CMD];

        switch (cmd) {
            case "Add":
                this.executeAdd(args);
                break;
            case "Remove":
                this.executeRemove(args);
                break;
            case "Contains":
                this.execcuteContains(args);
                break;
            case "Swap":
                this.executeSwap(args);
                break;
            case "Greater":
                this.executeGreater(args);
                break;
            case "Max":
                this.executeMax();
                break;
            case "Min":
                this.executeMin();
                break;
            case "Sort":
                this.executeSort();
                break;
            case "Print":
                this.executePrint();
                break;
        }
    }

    private void executeAdd(String[] args) {
        String element = args[INT_FIRST_PARAMETER];
        this.list.add(element);
    }

    private void executeRemove(String[] args) {
        int index = Integer.parseInt(args[INT_FIRST_PARAMETER]);
        this.list.remove(index);
    }

    private void execcuteContains(String[] args) {
        String element = args[INT_FIRST_PARAMETER];
        System.out.println(this.list.contains(element));
    }

    private void executeSwap(String[] args) {
        int firstElement = Integer.parseInt(args[INT_FIRST_PARAMETER]);
        int secondElement = Integer.parseInt(args[INT_SECOND_PARAMETER]);
        this.list.swap(firstElement, secondElement);
    }

    private void executeGreater(String[] args) {
        String element = args[INT_FIRST_PARAMETER];
        System.out.println(this.list.countGreaterThat(element));
    }

    private void executeMax() {
        System.out.println(this.list.getMax());
    }

    private void executeMin() {
        System.out.println(this.list.getMin());
    }

    private void executeSort() {
        Sort.Sort(this.list);
    }

    private void executePrint() {
        StringBuilder sb = new StringBuilder();
        for (String s : this.list) {
            sb.append(s).append(System.lineSeparator());
        }
        System.out.println(sb.toString().trim());
    }
}
