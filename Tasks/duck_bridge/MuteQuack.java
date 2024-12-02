package Tasks.duck_bridge;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<<Silence>>>");
    }
}
