package Tasks.Singleton_Pattern;

public class Singleton_sync_second {
    private static Singleton_sync_second uniqueInstance = new Singleton_sync_second();

    private Singleton_sync_second() {}

    public static Singleton_sync_second getInstance() {
        return uniqueInstance;
    }
}
