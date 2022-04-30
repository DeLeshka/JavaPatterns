package creationalPatterns.abstractFactory.abstractFurnitureFactory;

import creationalPatterns.abstractFactory.abstractFurniture.Chair;
import creationalPatterns.abstractFactory.abstractFurniture.Sofa;
import creationalPatterns.abstractFactory.abstractFurniture.Table;

public interface FurnitureFactory {

    Chair createChair();
    Table createTable();
    Sofa createSofa();

}
