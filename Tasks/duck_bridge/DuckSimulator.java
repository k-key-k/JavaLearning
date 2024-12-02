package Tasks.duck_bridge;

public class DuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck(new FlyWithWings(), new Quack());
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck rubber = new RubberDuck(new FlyNoWay(), new MuteQuack());
        rubber.display();
        rubber.performFly();
        rubber.performQuack();
    }
}
