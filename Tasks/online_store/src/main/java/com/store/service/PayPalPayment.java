package Tasks.online_store.src.main.java.com.store.service;

import Tasks.online_store.src.main.java.com.store.model.Order;

public class PayPalPayment implements PaymentMethod {
    public void processPayment(Order order) {
        System.out.println("Processing PayPal payment for order: " + order.getId());
    }
}

