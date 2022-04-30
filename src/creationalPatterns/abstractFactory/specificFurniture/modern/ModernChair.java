package creationalPatterns.abstractFactory.specificFurniture.modern;

import creationalPatterns.abstractFactory.abstractFurniture.Chair;

public class ModernChair implements Chair {

    @Override
    public void sit() {
        System.out.println("You're sitting on a modern chair");
    }

}
