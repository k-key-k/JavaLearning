package Tasks.Fabric_Pattern.AbstractFactory.Modern;

import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Table;

public class ModernTable implements Table {
    @Override
    public void hasLegs() {
        System.out.println("Modern Table without legs...");
    }

    @Override
    public void putOn() {
        System.out.println("Put cup on modern table...");
    }
}
