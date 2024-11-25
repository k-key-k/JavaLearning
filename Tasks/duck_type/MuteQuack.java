package Tasks.duck_type;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<SILENCE>>");
    }
}
