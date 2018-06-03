import java.util.List;

final class OutputWriter {

    private String filter;
    private List<Birthable> entitiesToOutput;

    OutputWriter(String filter, List<Birthable> entitiesToOutput) {
        this.filter = filter;
        this.entitiesToOutput = entitiesToOutput;
    }

    void printOutput() {
        this.entitiesToOutput.stream()
                .map(Birthable::getBirthDate)
                .filter(b -> b.endsWith(this.filter))
                .forEach(System.out::println);
    }
}