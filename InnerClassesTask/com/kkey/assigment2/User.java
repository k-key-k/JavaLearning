package InnerClassesTask.com.kkey.assigment2;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {

        class Query {

            void printToLog() {
                System.out.println("User with login: " + login
                        + " and password: " + password
                        + " send a request.");
            }

            void utilityMethod1() {
                System.out.println("Utility method1 completed.");
            }

            void callHelper() {
                System.out.println(QueryHelper.getUtilityMessage("call from createQuery()"));
            }
        }

        Query query = new Query();
        query.printToLog();
        query.utilityMethod1();
        query.callHelper();
    }

    public QueryInterface getQueryInstance() {
        class Query implements QueryInterface {

            @Override
            public void printToLog() {
                System.out.println("User with login: " + login
                        + " and password: " + password
                        + " send a request (from inner object).");
            }

            void utilityMethod1() {
                System.out.println("Utility method1 completed (from inner object).");
            }

            void callHelper() {
                System.out.println(QueryHelper.getUtilityMessage("call from getQueryInstance()"));
            }
        }

        Query query = new Query();
        query.utilityMethod1();
        query.callHelper();
        return query;
    }

    public interface QueryInterface {
        void printToLog();
    }

    public static class QueryHelper {
        public static String getUtilityMessage(String info) {
            return "Utility message: " + info;
        }
    }
}