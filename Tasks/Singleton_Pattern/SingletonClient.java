package Tasks.Singleton_Pattern;

public class SingletonClient {
    public static void main(String[] args) {

        Singleton_enum singletonEnum = Singleton_enum.UNIQUE_INSTANCE;
        singletonEnum.Action();
    }
}
