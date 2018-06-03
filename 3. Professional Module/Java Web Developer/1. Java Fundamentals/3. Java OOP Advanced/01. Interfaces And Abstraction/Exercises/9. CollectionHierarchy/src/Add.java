import java.util.ArrayList;
import java.util.List;

public class Add implements Addable{
    private List<String> items;

    public Add() {
        this.items = new ArrayList<>(100);
    }


    @Override
    public Integer add(String a) {
        this.items.add(a);
        return this.items.size() - 1;
    }
}