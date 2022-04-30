package creationalPatterns.abstractFactory.specificFactories;

import creationalPatterns.abstractFactory.abstractFurniture.Chair;
import creationalPatterns.abstractFactory.abstractFurniture.Sofa;
import creationalPatterns.abstractFactory.abstractFurniture.Table;
import creationalPatterns.abstractFactory.abstractFurnitureFactory.FurnitureFactory;
import creationalPatterns.abstractFactory.specificFurniture.modern.ModentSofa;
import creationalPatterns.abstractFactory.specificFurniture.modern.ModernChair;
import creationalPatterns.abstractFactory.specificFurniture.modern.ModernTable;

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
        return new ModentSofa();
    }

}
