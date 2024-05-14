package main;

import clase.decorator.DecoratorAbstract;
import clase.decorator.DecoratorLMA;
import clase.obiect.Bilet;
import clase.obiect.BiletAbstract;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet = new Bilet(1563, "10.08.2024");
        bilet.printeazaBilet();

        System.out.println();
        DecoratorAbstract decorator = new DecoratorLMA(bilet);
        decorator.printeazaBilet();

        System.out.println();
        decorator.printeazaMesaj();
    }
}
