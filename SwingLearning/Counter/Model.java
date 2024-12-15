package SwingLearning.Counter;

class Model {
    private int count;

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void reset() {
        count = 0;
    }
}
