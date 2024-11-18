package Tasks.Zoopark_ver_3;

import java.util.List;

public class ZooKipa {

    public <T extends Animal> void feedAnimals(List<T> animals) {
        for (T animal : animals) {
            animal.eats();
        }
    }
}
