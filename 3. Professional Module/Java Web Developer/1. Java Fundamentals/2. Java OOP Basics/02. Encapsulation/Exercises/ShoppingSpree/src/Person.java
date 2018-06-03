import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Integer money;
    private List<Product> bag;

    public Person(String name, Integer money) {
        this.setName(name);
        this.setMoney(money);
        this.bag = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public Integer getMoney() {
        return this.money;
    }

    public void setMoney(Integer money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void AddProductToBag(Product product) {
        this.bag.add(product);
    }

    public List<Product> seeBag() {
        return this.bag;
    }
}