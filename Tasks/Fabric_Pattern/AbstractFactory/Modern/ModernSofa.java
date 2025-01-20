package Tasks.Fabric_Pattern.AbstractFactory.Modern;

import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("Modern Sofa without legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Lie on modern sofa...");
    }
}
