package InnerClassesTask.com.kkey.assigment2;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("user1", "pass1");
        System.out.println("user1.createQuery():");
        user1.createQuery();

        System.out.println("\nQuery from getQueryInstance()");
        User.QueryInterface queryInstance = user1.getQueryInstance();
        queryInstance.printToLog();

        System.out.println("\ncreate Query from new User().getQueryInstance():");
        new User("user2", "pass2").getQueryInstance().printToLog();
    }
}
