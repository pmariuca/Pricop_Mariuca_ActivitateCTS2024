package main;

import classes.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Mariuca");
        Zoo zoo = new Zoo("Pink zoo", zooKeeper, new ArrayList<>(), new HashMap<>());
        Lion leu = new Lion("Lioness", 3);
        zoo.addAnimal(leu, "meat");

        Zebra zebra = new Zebra("Dungatul", 4);
        zoo.addAnimal(zebra, "grass");

        Cat cat = new Cat("Pinky", 3);
        zoo.addAnimal(cat, "fishy");

        zoo.feedAllAnimals();
    }
}