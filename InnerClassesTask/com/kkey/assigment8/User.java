package InnerClassesTask.com.kkey.assigment8;

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

    public void createQuery() {
        if (this.role == INames.userRole.ADMIN || this.role == INames.userRole.MODERATOR) {
            System.out.println("User " + login + "(Role: " + role + ") send a request.");
        } else {
            System.out.println("Error: user " + login + " can't send a request.");
        }
    }
}
