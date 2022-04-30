package creationalPatterns.abstractFactory.specificFurniture.artDeco;

import creationalPatterns.abstractFactory.abstractFurniture.Sofa;

public class ArtDecoSofa implements Sofa {

    @Override
    public void lay() {
        System.out.println("You're laying on an art deco sofa");
    }

}
