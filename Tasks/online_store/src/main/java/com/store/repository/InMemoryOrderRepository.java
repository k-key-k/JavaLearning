package Tasks.online_store.src.main.java.com.store.repository;

import Tasks.online_store.src.main.java.com.store.model.Order;

import java.util.HashMap;
import java.util.Map;

public class InMemoryOrderRepository implements OrderRepository {
    private Map<Long, Order> orderStorage = new HashMap<>();

    @Override
    public void save(Order order) {
        System.out.println("Saving order with ID: " + order.getId());
        orderStorage.put(order.getId(), order);
    }

    @Override
    public Order findById(long id) {
        System.out.println("Finding order with ID: " + id);
        return orderStorage.get(id);
    }
}

