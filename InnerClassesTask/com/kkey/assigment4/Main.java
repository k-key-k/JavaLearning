package InnerClassesTask.com.kkey.assigment4;

public class Main {
    public static void main(String[] args) {

        User user = new User("AUser", "APass");

        System.out.println("Anonymous class from createAnonymousQuery()");
        user.createAnonymousQuery();

        System.out.println("\nCreating Anonymous class");
        User.IQuery query2 = new User.IQuery() {
            @Override
            public void printToLog() {
                System.out.println("Anonymous call.");
            }
        };
        query2.printToLog();
    }
}
