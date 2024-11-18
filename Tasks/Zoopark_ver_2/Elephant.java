package Tasks.Zoopark_ver_2;

//public class Elephant implements IEater {
//    public void eats() {
//        System.out.println("eats...");
//    }
//}

public class Elephant extends Animal {
    @Override
    public void eats() {
        System.out.println("Elephant ест");
    }
}