package InnerClassesTask.com.kkey.assigment6;

public class Main {
    public static void main(String[] args) {

        User user = new User("user", "pass");

        IQuery query = new IQuery.Query(user);
        query.printToLog();
    }
}
