package InnerClassesTask.com.kkey.assigment10;

public class Main {
    public static void main(String[] args) {

        User admin = new User("Admin", "Admin", User.INames.UserRole.ADMIN);
        User mod = new User("Moderator", "Moderator", User.INames.UserRole.MODERATOR);
        User user = new User("regularUser", "regularUser", User.INames.UserRole.USER);

        System.out.println("\n--- Test sending requests ---");
        admin.createQuery();
        mod.createQuery();
        user.createQuery();
    }
}
