package creationalPatterns.abstractFactory.specificFurniture.victorian;

import creationalPatterns.abstractFactory.abstractFurniture.Sofa;

public class VictorianSofa implements Sofa {

    @Override
    public void lay() {
        System.out.println("You're laying on a victorian sofa");
    }

}
