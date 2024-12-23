package Tasks.Adapter_Pattern.Object;

public class RandomGeneratorAdapter implements Generator {

    private final RandomGenerator adaptee;

    public RandomGeneratorAdapter(RandomGenerator adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public int next() {
        return adaptee.getRandomNumber();
    }
}
