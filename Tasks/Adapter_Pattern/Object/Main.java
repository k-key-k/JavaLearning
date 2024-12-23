package Tasks.Adapter_Pattern.Object;

public class Main {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();
        RandomGeneratorAdapter adapter = new RandomGeneratorAdapter(randomGenerator);
        SequenceGenerator sequenceGenerator = new SequenceGenerator(adapter);

        int size = 10;

        int[] seq = sequenceGenerator.generate(size);
        for (int i = 0; i < size; i++) {
            System.out.print(seq[i] + " ");
        }
    }
}
