package InnerClassesTask.com.kkey.assigment4;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public interface IQuery {
        default void printToLog() {
            System.out.println("Default msg from IQuery");
        }
    }

    public void createAnonymousQuery() {
        String prefix = "Anonymous call:";

        IQuery query = new IQuery() {
            @Override
            public void printToLog() {
                System.out.println(prefix + " User with login: " + login +
                        " and password: " + password + " send a request.");
            }
        };

        query.printToLog();
    }
}
