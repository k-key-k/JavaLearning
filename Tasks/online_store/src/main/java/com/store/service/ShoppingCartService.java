package Tasks.online_store.src.main.java.com.store.service;

import Tasks.online_store.src.main.java.com.store.model.Product;

public class ShoppingCartService {
    public void addProductToCart(Product product) {
        System.out.println("Product " + product.getName() + " added to cart.");
    }

    public void removeProductFromCart(Product product) {
        System.out.println("Product " + product.getName() + " removed from cart.");
    }

    public void calculateTotalPrice() {
        System.out.println("Calculating total price of items in the cart.");
    }
}
