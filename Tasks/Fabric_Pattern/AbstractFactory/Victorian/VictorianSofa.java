package Tasks.Fabric_Pattern.AbstractFactory.Victorian;

import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("Beautiful 4 legs...");
    }

    @Override
    public void sitOn() {
        System.out.println("Sit with pafos on victorian Sofa...");
    }
}
