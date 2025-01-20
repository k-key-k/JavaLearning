package Tasks.Fabric_Pattern.AbstractFactory.Victorian;

import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Chair;
import Tasks.Fabric_Pattern.AbstractFactory.Furniture.FurnitureFactory;
import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Sofa;
import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Table;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
