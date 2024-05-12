package main;

import decorator.DecoratorAbstract;
import decorator.DecoratorMesaj;
import restaurant.NotaDePlata;
import restaurant.NotaDePlataAbstract;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata("Pop Ion", 169.32);
        notaDePlata.printeazaNota();

        System.out.println();

        DecoratorAbstract decorator = new DecoratorMesaj(notaDePlata);
        decorator.afisareMesaj();
    }
}
