package Tasks.online_store.src.main.java.com.store.service;

import Tasks.online_store.src.main.java.com.store.model.Order;

public interface PaymentMethod {
    void processPayment(Order order);
}

