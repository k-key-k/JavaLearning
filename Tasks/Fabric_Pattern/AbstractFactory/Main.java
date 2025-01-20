package Tasks.Fabric_Pattern.AbstractFactory;

import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Chair;
import Tasks.Fabric_Pattern.AbstractFactory.Furniture.FurnitureFactory;
import Tasks.Fabric_Pattern.AbstractFactory.Furniture.Sofa;
import Tasks.Fabric_Pattern.AbstractFactory.Modern.ModernFurnitureFactory;
import Tasks.Fabric_Pattern.AbstractFactory.Victorian.VictorianChair;
import Tasks.Fabric_Pattern.AbstractFactory.Victorian.VictorianFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        FurnitureFactory modernFactory = new ModernFurnitureFactory();

        Chair vChair = victorianFactory.createChair();
        vChair.hasLegs();
        vChair.sitOn();

        System.out.println();

        Sofa mSofa = modernFactory.createSofa();
        mSofa.hasLegs();
        mSofa.sitOn();
    }
}
