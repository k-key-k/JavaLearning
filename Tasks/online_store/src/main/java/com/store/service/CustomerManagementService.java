package Tasks.online_store.src.main.java.com.store.service;

import Tasks.online_store.src.main.java.com.store.model.Customer;

public interface CustomerManagementService {
    void registerUser(Customer customer);
    void loginUser(String email, String password);
}
