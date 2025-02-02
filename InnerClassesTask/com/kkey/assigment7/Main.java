package InnerClassesTask.com.kkey.assigment7;

public class Main {
    public static void main(String[] args) {
        User user = new User("user", "pass");

        System.out.println("--- Using anonymous class with local class ---");
        user.createAnonymousQueryLocal();

        System.out.println("\n--- Using anonymous class with external class ---");
        user.createAnonymousQueryExternal();
    }
}
