package creationalPatterns.abstractFactory.application;

import creationalPatterns.abstractFactory.specificFurniture.artDeco.ArtDecoChair;
import creationalPatterns.abstractFactory.specificFurniture.artDeco.ArtDecoSofa;
import creationalPatterns.abstractFactory.specificFurniture.artDeco.ArtDecoTable;
import creationalPatterns.abstractFactory.specificFurniture.modern.ModentSofa;
import creationalPatterns.abstractFactory.specificFurniture.modern.ModernChair;
import creationalPatterns.abstractFactory.specificFurniture.modern.ModernTable;
import creationalPatterns.abstractFactory.specificFurniture.victorian.VictorianChair;
import creationalPatterns.abstractFactory.specificFurniture.victorian.VictorianSofa;
import creationalPatterns.abstractFactory.specificFurniture.victorian.VictorianTable;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class FurnitureStore {

    public static FurnitureSet orderFurniture() {
        System.out.println("This store provides Art Deco, Modern and Victorian furniture.");
        System.out.println("What furniture would you like to order? (a/m/v)");
        char choice;

        Reader reader = new InputStreamReader(System.in);

        try {
            choice = (char) reader.read();
        }
        catch (IOException exception) {
            System.out.println(exception.getMessage());
            return orderFurniture();
        }

        switch (choice) {
            case 'a':
                return new FurnitureSet(new ArtDecoChair(),
                                        new ArtDecoTable(),
                                        new ArtDecoSofa());
            case 'm':
                return new FurnitureSet(new ModernChair(),
                                        new ModernTable(),
                                        new ModentSofa());
            case 'v':
                return new FurnitureSet(new VictorianChair(),
                                        new VictorianTable(),
                                        new VictorianSofa());
            default:
                System.out.println("error");
                return orderFurniture();
        }

    }

}
