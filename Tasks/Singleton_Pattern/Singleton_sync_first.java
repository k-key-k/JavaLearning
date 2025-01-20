package Tasks.Singleton_Pattern;

public class Singleton_sync_first {
    private static Singleton_sync_first uniqueInstance;
    private Singleton_sync_first() {}

    public static synchronized Singleton_sync_first getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton_sync_first();
        }
        return uniqueInstance;
    }
}
