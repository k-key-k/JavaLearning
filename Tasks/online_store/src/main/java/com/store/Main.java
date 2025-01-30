package Tasks.online_store.src.main.java.com.store;

import Tasks.online_store.src.main.java.com.store.model.Order;
import Tasks.online_store.src.main.java.com.store.model.Product;
import Tasks.online_store.src.main.java.com.store.repository.InMemoryOrderRepository;
import Tasks.online_store.src.main.java.com.store.repository.OrderRepository;
import Tasks.online_store.src.main.java.com.store.service.*;

public class Main {
    public static void main(String[] args) {
        OrderRepository orderRepository = new InMemoryOrderRepository();
        OrderService orderService = new OrderService(orderRepository);

        PaymentMethod paymentMethod = new CreditCardPayment();
        NotificationChannel notificationChannel = new EmailNotification();

        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Smartphone", 800);

        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.addProductToCart(product1);
        shoppingCartService.addProductToCart(product2);
        shoppingCartService.calculateTotalPrice();

        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);
        orderService.createOrder(order);

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment(paymentMethod, order);

        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(order, notificationChannel);
    }
}

