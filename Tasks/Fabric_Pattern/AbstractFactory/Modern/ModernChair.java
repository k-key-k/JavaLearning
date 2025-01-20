package Tasks.Fabric_Pattern.AbstractFactory.Modern;

import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Chair;

public class ModernChair implements Chair {
    @Override
    public void hasLegs() {
        System.out.println("Modern chair without legs...");
    }

    @Override
    public void sitOn() {
        System.out.println("Sit on modern chair...");
    }
}
