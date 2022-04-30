package creationalPatterns.abstractFactory.specificFurniture.victorian;

import creationalPatterns.abstractFactory.abstractFurniture.Table;

public class VictorianTable implements Table {

    @Override
    public void put() {
        System.out.println("You're putting your stuff on a victorian table");
    }

}
