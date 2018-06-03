import java.util.ArrayList;
import java.util.List;

public class MyList implements ListInterface {
    private List<String> items;

    public MyList() {
        this.items = new ArrayList<>(100);
    }

    @Override
    public Integer used() {
        return this.items.size();
    }

    @Override
    public String remove() {
        return this.items.remove(0);
    }

    @Override
    public Integer add(String a) {
        this.items.add(0, a);
        return 0;
    }
}
