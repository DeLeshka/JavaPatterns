package creationalPatterns.abstractFactory.application;

public class Main {

    public static void main(String[] args) {

        FurnitureSet furnitureSet = FurnitureStore.orderFurniture();
        furnitureSet.useFurniture();

    }

}
