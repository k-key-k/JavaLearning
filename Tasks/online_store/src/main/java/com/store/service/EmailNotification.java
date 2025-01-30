package Tasks.online_store.src.main.java.com.store.service;

import Tasks.online_store.src.main.java.com.store.model.Order;

public class EmailNotification implements NotificationChannel {
    public void sendNotification(Order order) {
        System.out.println("Sending email notification for order: " + order.getId());
    }
}

