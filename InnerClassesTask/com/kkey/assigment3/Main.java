package InnerClassesTask.com.kkey.assigment3;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("login1", "pass1");

        User.Query query = new User.Query(user1);
        query.printToLog();
    }
}
