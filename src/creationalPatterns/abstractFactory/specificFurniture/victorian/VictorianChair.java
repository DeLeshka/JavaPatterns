package creationalPatterns.abstractFactory.specificFurniture.victorian;

import creationalPatterns.abstractFactory.abstractFurniture.Chair;

public class VictorianChair implements Chair {

    @Override
    public void sit() {
        System.out.println("you're sitting on a victorian chair");
    }

}
