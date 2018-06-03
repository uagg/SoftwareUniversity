import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] peopleAndMoney = reader.readLine().split("[;=]");
        String[] productsAndValue = reader.readLine().split("[;=]");
        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        for (int i = 0; i < peopleAndMoney.length - 1; i+=2) {
            String name = peopleAndMoney[i];
            Integer money = Integer.parseInt(peopleAndMoney[i + 1]);
            try {
                Person person = new Person(name, money);
                people.add(person);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                return;
            }
        }

        for (int i = 0; i < productsAndValue.length - 1; i+=2) {
            String name = productsAndValue[i];
            Integer money = Integer.parseInt(productsAndValue[i + 1]);
            try {
                Product product = new Product(name, money);
                products.add(product);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                return;
            }
        }

        String[] command = reader.readLine().split(" ");

        while (!command[0].equals("END")) {
            String personName = command[0];
            String productName = command[1];

            Person person = null;

            for (Person p : people) {
                if (p.getName().equals(personName)) {
                    person = p;
                }
            }

            Product product = null;

            for (Product p : products) {
                if (p.getProductName().equals(productName)) {
                    product = p;
                }
            }

            if (person.getMoney() >= product.getPrice()) {
                Integer personMoney = person.getMoney();
                Integer productPrice = product.getPrice();
                personMoney -= productPrice;
                person.setMoney(personMoney);
                person.AddProductToBag(product);
                System.out.println(person.getName() + " bought " + product.getProductName());
            } else {
                System.out.println(person.getName() + " can't afford " + product.getProductName());
            }

            command = reader.readLine().split(" ");
        }

        for (Person person : people) {
            if (person.seeBag().size() > 0) {
                List<Product> a = new ArrayList<>();
                List<String> output = new ArrayList<>();
                a.addAll(person.seeBag());
                for (int i = 0; i < a.size(); i++) {
                    String name = a.get(i).getProductName();
                    output.add(name);
                }
                System.out.println(person.getName() + " - " + String.join(", ", output));
            } else {
                System.out.println(person.getName() + " - Nothing bought");
            }
        }
    }
}
