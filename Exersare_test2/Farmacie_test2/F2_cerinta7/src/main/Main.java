package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        BonCasa bon = new BonCasa(123);
        bon.adaugaProdus(new Produs("Paracetamol", 5.36));
        bon.adaugaProdus(new Produs("Nurofen", 35.6));
        bon.printeaza();
        System.out.println();

        DecoratorAbstract decorator = new DecoratorLMA(bon);
        decorator.afiseazaMesaj();
    }
}
