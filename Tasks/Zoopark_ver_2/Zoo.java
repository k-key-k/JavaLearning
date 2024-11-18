package Tasks.Zoopark_ver_2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        Lion lion1 = new Lion();
        Elephant elephant1 = new Elephant();
        Zebra zebra1 = new Zebra();
        Zebra zebra2 = new Zebra();
        Zebra zebra3 = new Zebra();

        ArrayList<IEater> eaters = new ArrayList<>();
        eaters.add(lion1);
        eaters.add(elephant1);
        eaters.add(zebra1);
        eaters.add(zebra2);
        eaters.add(zebra3);

        ZooKipa zooKipa = new ZooKipa();

        for (IEater e : eaters) {
            zooKipa.toFeedEater(e);
        }

        List<Animal> animals = new ArrayList<>();
        animals.add(lion1);
        animals.add(elephant1);
        animals.add(zebra1);
        animals.add(zebra3);
        animals.add(zebra2);

        ZooKipa_callback zooKipa_callback = new ZooKipa_callback();

        zooKipa_callback.feedAnimals(animals, animal -> animal.eats());
    }
}
