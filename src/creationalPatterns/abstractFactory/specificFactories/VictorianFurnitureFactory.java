package creationalPatterns.abstractFactory.specificFactories;

import creationalPatterns.abstractFactory.abstractFurniture.Chair;
import creationalPatterns.abstractFactory.abstractFurniture.Sofa;
import creationalPatterns.abstractFactory.abstractFurniture.Table;
import creationalPatterns.abstractFactory.abstractFurnitureFactory.FurnitureFactory;
import creationalPatterns.abstractFactory.specificFurniture.victorian.VictorianChair;
import creationalPatterns.abstractFactory.specificFurniture.victorian.VictorianSofa;
import creationalPatterns.abstractFactory.specificFurniture.victorian.VictorianTable;

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
