package Tasks.online_store.src.main.java.com.store.model;

public class Customer {
    private String name;
    private String email;

    public String getName() {
        System.out.println("getting customer name");
        return name;
    }

    public String getEmail() {
        System.out.println("getting customer email");
        return email;
    }
}
