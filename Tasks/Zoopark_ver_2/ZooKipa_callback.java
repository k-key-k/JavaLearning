package Tasks.Zoopark_ver_2;

import java.util.List;

public class ZooKipa_callback {

    public <T extends Animal> void feedAnimals(List<T> animals, FeedAction<T> action) {
        for (T animal : animals) {
            action.feed(animal);
        }
    }

    public interface FeedAction<T> {
        void feed(T animal);
    }
}
