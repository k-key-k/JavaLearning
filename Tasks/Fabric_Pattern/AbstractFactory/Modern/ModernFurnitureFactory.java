package Tasks.Fabric_Pattern.AbstractFactory.Modern;

import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Chair;
import Tasks.Fabric_Pattern.AbstractFactory.Furniture.FurnitureFactory;
import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Sofa;
import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
