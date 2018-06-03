import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String inputTitle, int inputYear, String... authors) {
        this.setTitle(inputTitle);
        this.setYear(inputYear);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return Collections.unmodifiableList(authors);
    }

    private void setAuthors(String[] authors) {
        if(authors.length == 0) {
            this.authors = new ArrayList<>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    @Override
    public int compareTo(Book o) {
        int internalSize = this.getAuthors().size();
        int externalSize = o.authors.size();
        if(internalSize > externalSize) {
            return 1;
        } else if (internalSize < externalSize) {
            return -1;
        } else {
            return 0;
        }
    }
}
