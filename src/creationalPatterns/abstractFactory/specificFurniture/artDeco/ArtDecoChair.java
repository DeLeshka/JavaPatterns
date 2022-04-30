package creationalPatterns.abstractFactory.specificFurniture.artDeco;

import creationalPatterns.abstractFactory.abstractFurniture.Chair;

public class ArtDecoChair implements Chair {

    @Override
    public void sit() {
        System.out.println("you're sitting on an art deco chair");
    }

}
