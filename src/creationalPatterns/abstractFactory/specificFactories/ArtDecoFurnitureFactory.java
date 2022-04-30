package creationalPatterns.abstractFactory.specificFactories;

import creationalPatterns.abstractFactory.abstractFurniture.Chair;
import creationalPatterns.abstractFactory.abstractFurniture.Sofa;
import creationalPatterns.abstractFactory.abstractFurniture.Table;
import creationalPatterns.abstractFactory.abstractFurnitureFactory.FurnitureFactory;
import creationalPatterns.abstractFactory.specificFurniture.artDeco.ArtDecoChair;
import creationalPatterns.abstractFactory.specificFurniture.artDeco.ArtDecoSofa;
import creationalPatterns.abstractFactory.specificFurniture.artDeco.ArtDecoTable;

public class ArtDecoFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Table createTable() {
        return new ArtDecoTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
