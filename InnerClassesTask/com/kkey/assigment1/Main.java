package InnerClassesTask.com.kkey.assigment1;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("login1", "password1");
        System.out.println("createQuery()");
        user1.createQuery();

        System.out.println("\nuser1.new Query()");
        User.Query query1 = user1.new Query();
        query1.printToLog();

        System.out.println("\nUser().new Query()");
        new User("login2", "password2").new Query().printToLog();
    }
}
