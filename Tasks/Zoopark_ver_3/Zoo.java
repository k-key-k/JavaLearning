package Tasks.Zoopark_ver_3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {

        Lion lion1 = new Lion();
        Elephant elephant1 = new Elephant();
        Zebra zebra1 = new Zebra();
        Zebra zebra2 = new Zebra();
        Zebra zebra3 = new Zebra();

        List<Animal> animals = new ArrayList<>();
        animals.add(lion1);
        animals.add(elephant1);
        animals.add(zebra1);
        animals.add(zebra2);
        animals.add(zebra3);

        ZooKipa zooKipa = new ZooKipa();

        zooKipa.feedAnimals(animals);
    }
}
