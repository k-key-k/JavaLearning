package Tasks.Fabric_Pattern.AbstractFactory.Victorian;

import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Chair;

public class VictorianChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Beautiful 4 legs...");
    }

    @Override
    public void sitOn() {
        System.out.println("Sit with pafos on victorian chair...");
    }
}
