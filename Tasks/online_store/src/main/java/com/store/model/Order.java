package Tasks.online_store.src.main.java.com.store.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private long id;
    private List<Product> products;

    public Order() {
        this.id = System.currentTimeMillis();
        this.products = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void addProduct(Product product) {
        System.out.println("Adding product to order.");
        products.add(product);
    }

    public List<Product> getProducts() {
        System.out.println("Getting products in order.");
        return products;
    }
}

