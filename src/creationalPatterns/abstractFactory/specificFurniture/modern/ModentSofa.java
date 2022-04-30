package creationalPatterns.abstractFactory.specificFurniture.modern;

import creationalPatterns.abstractFactory.abstractFurniture.Sofa;

public class ModentSofa implements Sofa {

    @Override
    public void lay() {
        System.out.println("You're laying on a modern sofa");
    }

}
