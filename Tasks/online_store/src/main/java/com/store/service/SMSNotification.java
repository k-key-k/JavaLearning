package Tasks.online_store.src.main.java.com.store.service;

import Tasks.online_store.src.main.java.com.store.model.Order;

public class SMSNotification implements NotificationChannel {
    public void sendNotification(Order order) {
        System.out.println("Sending SMS notification for order: " + order.getId());
    }
}

