package Tasks.Fabric_Pattern.AbstractFactory.Victorian;

import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Table;

public class VictorianTable implements Table {
    @Override
    public void hasLegs() {
        System.out.println("Beautiful 4 legs...");
    }

    @Override
    public void putOn() {
        System.out.println("Put big vase on victorian table...");
    }
}
