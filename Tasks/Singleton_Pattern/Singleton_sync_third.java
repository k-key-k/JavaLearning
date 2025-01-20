package Tasks.Singleton_Pattern;

public class Singleton_sync_third {
    private volatile static Singleton_sync_third uniqueInstance;
    private Singleton_sync_third() {}
    public static Singleton_sync_third getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton_sync_third.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton_sync_third();
                }
            }
        }
        return uniqueInstance;
    }
}
