package creationalPatterns.abstractFactory.specificFurniture.artDeco;

import creationalPatterns.abstractFactory.abstractFurniture.Table;

public class ArtDecoTable implements Table {

    @Override
    public void put() {
        System.out.println("You're putting your stuff on an art deco table");
    }

}
