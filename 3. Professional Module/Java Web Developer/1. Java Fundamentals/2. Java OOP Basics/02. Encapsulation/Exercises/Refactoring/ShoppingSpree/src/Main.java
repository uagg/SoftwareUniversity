import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // Filtered data from input
    private static List<Person> people = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();
    private static int exceptionCounter = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Input
        String[] inputPeople = reader.readLine().split(";");
        String[] inputProducts = reader.readLine().split(";");



        // Filtrating product data
        filtrateProductData(inputProducts);

        // Filtrating person data
        filtratePersonData(inputPeople);

        String input = reader.readLine();
        while(!"END".equals(input)) {
            String[] tokens = input.split("\\s+");
            String personName = tokens[0];
            String productName = tokens[1];

            Person currentPerson = getExactPerson(personName);
            Product currentProduct = getExactProduct(productName);

            if((currentPerson != null) && (currentProduct != null)) {
                if((currentPerson.getMoney() >= currentProduct.getPrice())) {
                    currentPerson.bagFill(currentProduct);
                    currentPerson.setMoney(currentPerson.getMoney() - currentProduct.getPrice());
                    System.out.printf("%s bought %s%n", currentPerson.getName(), currentProduct.getName());
                    setExactPerson(currentPerson);
                } else {
                    System.out.printf("%s can't afford %s%n", personName, productName);
                }
            }

            input = reader.readLine();
        }


        for (Person finalPerson : people) {
            if(finalPerson.getBagProducts().size() > 0) {
                System.out.print(finalPerson.getName() + " - ");
                List<Product> productsInBag = finalPerson.getBagProducts();
                List<String> productsNamesInBag = new ArrayList<>();
                for (Product pr : productsInBag) {
                    productsNamesInBag.add(pr.getName());
                }
                System.out.printf("%s", String.join(", ", productsNamesInBag));
            } else {
                System.out.printf("%s – Nothing bought%n", finalPerson.getName());
            }
        }
    }

    private static void filtrateProductData(String[] inputProducts) {
        for (String currentInput : inputProducts) {
            String[] tokens = currentInput.split("=");
            try {
                if(tokens[0].trim().length() > 0) {
                    Product currentProduct = new Product(tokens[0], Double.parseDouble(tokens[1]));
                    products.add(currentProduct);
                }
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
    }

    private static void filtratePersonData(String[] inputPeople) {
        for (String currentInput : inputPeople) {
            String[] tokens = currentInput.split("=");
            try {
                if(tokens[0].trim().length() > 0) {
                    Person currentPerson = new Person(tokens[0], Double.parseDouble(tokens[1]));
                    people.add(currentPerson);
                }
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                exceptionCounter++;
            }
        }
    }

    public static Product getExactProduct(String name) {
        Product exactProduct = null;

        for (Product exPr : products) {
            if(exPr.getName().equals(name)) {
                exactProduct = exPr;
            }
        }
        return exactProduct;
    }

    public static Person getExactPerson(String name) {
        Person exactPerson = null;

        for (Person exP : people) {
            if(exP.getName().equals(name)) {
                exactPerson = exP;
            }
        }
        return exactPerson;
    }

    public static void setExactPerson(Person currentPerson) {
        for (int i = 0; i < people.size(); i++) {
            if(people.get(i).equals(currentPerson)) {
                people.set(i, currentPerson);
            }
        }
    }
}