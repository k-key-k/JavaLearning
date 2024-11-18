package Tasks.Zoopark_ver_1;

public class Zoo {
    public static void main(String[] args) {

        Lion lion = new Lion();
        Zebra zebra = new Zebra();
        Elephant elephant = new Elephant();

        ZooKipa zooKipa = new ZooKipa();

        zooKipa.toFeedLion(lion);
        zooKipa.toFeedZebra(zebra);
        zooKipa.toFeedElephant(elephant);

//        zooKipa.toFeedElephant(zebra); Error
    }
}
