package InnerClassesTask.com.kkey.assigment7;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void createAnonymousQueryLocal() {
        class Query {
            public void printToLog() {
                System.out.println("Local class: User with login " + login +
                        " and password " + password + " send a request.");
            }
        }

        Query query = new Query() {
            @Override
            public void printToLog() {
                System.out.println("Anonymous class: User " + login +
                                " with password " + password + " send request.");
            }
        };

        query.printToLog();
    }

    public void createAnonymousQueryExternal() {
        ExternalQuery query = new ExternalQuery() {
            @Override
            public void printToLog() {
                System.out.println("Anonymous class (External): User " + login +
                        " with password " + password + " send request.");
            }
        };

        query.printToLog();
    }
}
