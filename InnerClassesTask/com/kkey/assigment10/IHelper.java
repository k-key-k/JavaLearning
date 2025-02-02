package InnerClassesTask.com.kkey.assigment10;

public interface IHelper {
    class NoAccessException extends Exception {
        public NoAccessException(String msg) {
            super(msg);
        }
    }

    static void checkRole(User.INames.UserRole role, String login) throws NoAccessException {
        if (role != User.INames.UserRole.ADMIN && role != User.INames.UserRole.MODERATOR) {
            throw new NoAccessException("Error: User " + login + " can't send request.");
        }
    }
}
