import java.util.ArrayList;
import java.util.List;

public class AddNRemove implements AddableNRemovable {
    private List<String> items;

    public AddNRemove() {
        this.items = new ArrayList<>(100);
    }

    @Override
    public String remove() {
        int lastItemIndex = this.items.size() - 1;
        return this.items.remove(lastItemIndex);
    }

    @Override
    public Integer add(String a) {
        this.items.add(0, a);
        return 0;
    }
}