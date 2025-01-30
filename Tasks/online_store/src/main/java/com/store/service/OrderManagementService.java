package Tasks.online_store.src.main.java.com.store.service;

import Tasks.online_store.src.main.java.com.store.model.Order;

public interface OrderManagementService {
    void createOrder(Order order);
    void updateOrderStatus(Order order, String status);
}