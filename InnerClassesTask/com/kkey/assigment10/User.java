package InnerClassesTask.com.kkey.assigment10;

public class User {
    private String login;
    private String password;
    private INames.UserRole role;

    public User(String login, String password, INames.UserRole role) {
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

    public INames.UserRole getRole() {
        return role;
    }

    public interface INames {
        enum UserRole {
            ADMIN, MODERATOR, USER
        }

        String DB_CONNECTION = "localhost:8000";
        int MAX_PASSWORD_LENGTH = 16;
    }

    public void createQuery() {
        try {
            IHelper.checkRole(this.role, this.login);
            System.out.println("User " + login + " (role: " + role + ") send a request.");
        } catch (IHelper.NoAccessException e) {
            System.err.println(e.getMessage());
        }
    }
}
