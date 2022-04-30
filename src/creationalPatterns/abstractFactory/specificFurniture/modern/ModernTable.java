package creationalPatterns.abstractFactory.specificFurniture.modern;

import creationalPatterns.abstractFactory.abstractFurniture.Table;

public class ModernTable implements Table {

    @Override
    public void put() {
        System.out.println("You're putting your stuff on a modern table");
    }

}
