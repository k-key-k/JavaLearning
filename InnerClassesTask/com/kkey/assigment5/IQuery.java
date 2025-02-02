package InnerClassesTask.com.kkey.assigment5;

public interface IQuery {

    static void printToLog(User user) {
        System.out.println("User with login: " + user.getLogin()
                    + " and password: " + user.getPassword()
                    + " send a request.");
    }
}
