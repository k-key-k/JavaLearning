package Tasks.Adapter_Pattern;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckApadter = new DuckAdapter(duck);

        System.out.println("Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuck says...");
        testDuck(duck);

        System.out.println("\nTurkeyAdapter says...");
        testDuck(turkeyAdapter);

        System.out.println("\nDuckAdapter says...");
        testTurkey(duckApadter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    private static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
