package InnerClassesTask.com.kkey.assigment9;

public class User {
    private String login;
    private String password;
    private INames.userRole role;

    public User(String login, String password, INames.userRole role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public INames.userRole getRole() {
        return role;
    }

    public interface INames {
        enum userRole {
            ADMIN, MODERATOR, USER
        }

        String DB_CONNECTION = "localhost:8000";
        int MAX_PASS_LENGTH = 16;
    }

    private static class NoAccessException extends Exception {
        public NoAccessException(String msg) {
            super(msg);
        }
    }

    public void createQuery() {
        try {
            if (this.role != INames.userRole.ADMIN && this.role != INames.userRole.MODERATOR) {
                throw new NoAccessException("Error: User " + login + " can't send request.");
            }
            System.out.println("User " + login + ("(Role: " + role + ") send request."));
        } catch (NoAccessException e) {
            System.err.println(e.getMessage());
        }
    }
}
