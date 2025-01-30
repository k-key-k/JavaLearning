package Tasks.online_store.src.main.java.com.store.service;

import Tasks.online_store.src.main.java.com.store.model.Order;
import Tasks.online_store.src.main.java.com.store.repository.OrderRepository;

public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void createOrder(Order order) {
        System.out.println("Creating order for product(s) in cart.");
        orderRepository.save(order);
    }

    public void updateOrderStatus(Order order, String status) {
        System.out.println("Updating order status to: " + status);
    }
}
