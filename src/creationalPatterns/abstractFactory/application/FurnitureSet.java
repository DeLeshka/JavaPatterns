package creationalPatterns.abstractFactory.application;

import creationalPatterns.abstractFactory.abstractFurniture.Chair;
import creationalPatterns.abstractFactory.abstractFurniture.Sofa;
import creationalPatterns.abstractFactory.abstractFurniture.Table;

public class FurnitureSet {

    private Chair chair;
    private Table table;
    private Sofa sofa;

    public FurnitureSet(Chair chair, Table table, Sofa sofa) {
        this.chair = chair;
        this.table = table;
        this.sofa = sofa;
    }

    public void useFurniture() {
        table.put();
        chair.sit();
        System.out.println("And finally,");
        sofa.lay();
    }

}
