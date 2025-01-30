package Tasks.online_store.src.main.java.com.store.service;

import Tasks.online_store.src.main.java.com.store.model.Order;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, Order order) {
        System.out.println("Processing payment for order: " + order.getId());
        paymentMethod.processPayment(order);
    }
}
