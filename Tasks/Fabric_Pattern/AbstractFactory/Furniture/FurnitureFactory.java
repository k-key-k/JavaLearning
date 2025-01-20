package Tasks.Fabric_Pattern.AbstractFactory.Furniture;

import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Chair;
import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Sofa;
import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
    Sofa createSofa();
}
