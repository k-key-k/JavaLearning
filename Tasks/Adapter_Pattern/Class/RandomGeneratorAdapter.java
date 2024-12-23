package Tasks.Adapter_Pattern.Class;

public class RandomGeneratorAdapter extends RandomGenerator implements Generator {
    @Override
    public int next() {
        return getRandomNumber();
    }
}
