package InnerClassesTask.com.kkey.assigment6;

public interface IQuery {
    void printToLog();

    public static class Query implements IQuery {

        private User user;

        public Query(User user) {
            this.user = user;
        }

        @Override
        public void printToLog() {
            System.out.println("User with login: " + user.getLogin()
                    + " and password: " + user.getPassword()
                    + " send a request.");
        }
    }
}
