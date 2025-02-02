package InnerClassesTask.com.kkey.assigment5;

public class Main {
    public static void main(String[] args) {

        User user = new User("user1", "pass1");

        System.out.println("Call static method printToLog from IQuery:");
        IQuery.printToLog(user);
    }
}
