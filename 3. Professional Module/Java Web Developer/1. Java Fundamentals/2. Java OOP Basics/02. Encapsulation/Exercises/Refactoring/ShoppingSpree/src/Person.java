import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;
    private double money;
    private List<Product> bag;

    public Person(String inputName, double inputCash) {
        this.setName(inputName);
        this.setMoney(inputCash);
        this.bag = new ArrayList<>();
    }

    void setName(String inputName) {
        inputName = inputName.trim();
        if(inputName.isEmpty() || "".equals(inputName)) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = inputName;
    }

    String getName() {
        return this.name;
    }

    void setMoney(double inputCash) {
        if(inputCash < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = inputCash;
    }

    double getMoney() {
        return this.money;
    }

    public void bagFill(Product inputProduct) {
        bag.add(inputProduct);
    }

    List<Product> getBagProducts() {
        return Collections.unmodifiableList(bag);
    }
}
