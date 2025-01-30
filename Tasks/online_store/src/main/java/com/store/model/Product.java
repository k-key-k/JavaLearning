package Tasks.online_store.src.main.java.com.store.model;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        System.out.println("getting product name");
        return name;
    }

    public double getPrice() {
        System.out.println("getting product price");
        return price;
    }
}
