public class Product {

    private String name;
    private double price;

    Product(String inputName, double inputPrice) {
        this.setName(inputName);
        this.setPrice(inputPrice);
    }

    private void setName(String inputName) {
        inputName = inputName.trim();
        if(inputName.isEmpty() || "".equals(inputName)) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = inputName;
    }

    private void setPrice(double inputPrice) {
        if(inputPrice < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.price = inputPrice;
    }

    double getPrice() {
        return this.price;
    }

    String getName() {
        return this.name;
    }
}
