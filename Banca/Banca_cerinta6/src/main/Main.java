package main;

import banca.Card;
import banca.CardAbstract;
import decorator.DecoratorAbstract;
import decorator.DecoratorContactless;
import decorator.DecoratorOnline;

public class Main {
    public static void main(String[] args) {
        CardAbstract cardAbstract = new Card("Pop Ion", "BRDE338556226658S62");
        cardAbstract.plateste(175.2);

        System.out.println();

        DecoratorAbstract decoratorOnline = new DecoratorOnline(cardAbstract);
        decoratorOnline.afiseazaMesaj(652.23);

        System.out.println();

        DecoratorAbstract decoratorContactless = new DecoratorContactless(cardAbstract);
        decoratorContactless.afiseazaMesaj(123.2);
    }
}
