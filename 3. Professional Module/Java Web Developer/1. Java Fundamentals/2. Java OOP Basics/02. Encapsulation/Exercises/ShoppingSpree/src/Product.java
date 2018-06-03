public class Product {

    private String productName;
    private Integer price;

    public Product(String name, Integer price) {
        this.setProductName(name);
        this.setPrice(price);
    }

    public Integer getPrice() {
        return this.price;
    }

    public void setPrice(Integer price) {
        if (price < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.price = price;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        if (productName.length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.productName = productName;
    }
}