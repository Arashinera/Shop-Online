package app.entity;

public class Product {

    //створення змінних сутності Product :
    private final String productName;

    //створення конструктору :
    public Product(String productName) {
        this.productName = productName;
    }

    //створення getter-ів :
    public String getProductName() {
        return productName;
    }
}
