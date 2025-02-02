package InnerClassesTask.com.kkey.assigment3;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static class Query {
        private User user;
        public Query(User user) {
            this.user = user;
        }
        public void printToLog() {
            System.out.println("User with login: " + user.login
                    + " and password: " + user.password
                    + " send a request (from inner object).");
            System.out.println("cant using non-static login and password from static class Query");
        }
    }
}
