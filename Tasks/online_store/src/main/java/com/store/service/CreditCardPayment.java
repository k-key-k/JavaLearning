package Tasks.online_store.src.main.java.com.store.service;

import Tasks.online_store.src.main.java.com.store.model.Order;

public class CreditCardPayment implements PaymentMethod {
    public void processPayment(Order order) {
        System.out.println("Processing credit card payment for order: " + order.getId());
    }
}

