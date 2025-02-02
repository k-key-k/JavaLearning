package InnerClassesTask.com.kkey.assigment9;

public class Main {
    public static void main(String[] args) {

        User admin = new User("Admin", "Admin", User.INames.userRole.ADMIN);
        User mod = new User("Moderator", "Moderator", User.INames.userRole.MODERATOR);
        User user = new User("regularUser", "regularUser", User.INames.userRole.USER);

        System.out.println("\n--- Test sending requests ---");
        admin.createQuery();
        mod.createQuery();
        user.createQuery();
    }
}
