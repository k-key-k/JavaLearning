package InnerClassesTask.com.kkey.assigment8;

public class Main {
    public static void main(String[] args) {
        System.out.println("DB connect: " + User.INames.DB_CONNECTION);
        System.out.println("Max password length: " + User.INames.MAX_PASS_LENGTH);

        User admin = new User("admin", "admin", User.INames.userRole.ADMIN);
        User mod = new User("mod", "mod", User.INames.userRole.MODERATOR);
        User user = new User("regularUser", "user", User.INames.userRole.USER);

        System.out.println("\n--- Test sending requests ---");
        admin.createQuery();
        mod.createQuery();
        user.createQuery();
    }
}
