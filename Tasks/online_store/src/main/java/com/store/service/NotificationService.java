package Tasks.online_store.src.main.java.com.store.service;

import Tasks.online_store.src.main.java.com.store.model.Order;

public class NotificationService {
    public void sendNotification(Order order, NotificationChannel notificationChannel) {
        System.out.println("Sending notification about order: " + order.getId());
        notificationChannel.sendNotification(order);
    }
}

