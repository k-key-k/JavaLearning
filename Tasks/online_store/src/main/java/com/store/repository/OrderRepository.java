package Tasks.online_store.src.main.java.com.store.repository;

import Tasks.online_store.src.main.java.com.store.model.Order;

public interface OrderRepository {
    void save(Order order);
    Order findById(long id);
}
