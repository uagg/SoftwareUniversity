import java.text.Collator;
import java.util.Comparator;

class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person first, Person second) {
        int nameResult =
                first.getName().length()
                        - second.getName().length();

        if (nameResult == 0) {
            return Collator.getInstance().compare(first.getName(), second.getName());
        }
        return nameResult;
    }
}