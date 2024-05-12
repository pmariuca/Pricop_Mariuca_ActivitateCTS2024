package main;

import softNou.Bar;
import softNou.Bautura;
import softVechi.*;

public class Main {
    public static void main(String[] args) {
        SoftBucatarie bucatarie = new Bucatarie();
        Produs produs1 = new Produs("Pizza", 45);
        Produs produs2 = new Produs("Paste", 39.5);
        Produs produs3 = new Produs("Salata", 26.5);
        bucatarie.adaugareProdus(produs1);
        bucatarie.adaugareProdus(produs2);
        bucatarie.adaugareProdus(produs3);
        bucatarie.printeazaBon();
        System.out.println();

        Bar bar = new Bar();
        Bautura bautura1 = new Bautura("Hugo Spritz", 28.5);
        Bautura bautura2 = new Bautura("Aperol Spritz", 29.5);
        Bautura bautura3 = new Bautura("Apa", 8.5);
        bar.adaugaBautura(bautura1);
        bar.adaugaBautura(bautura2);
        bar.adaugaBautura(bautura3);
        bar.printareNotaDePlata();
        System.out.println();

        AdapterBarBucatarie barNou = new AdapterBarBucatarie();
        barNou.adaugaBautura(new Bautura("Mojito", 30.5));
        barNou.adaugaBautura(new Bautura("Chambord Spritz", 35.5));

        Bautura bauturaProdus = new Bautura("Cola", 9.5);
        AdapterBauturaProdus produsNou = new AdapterBauturaProdus(bauturaProdus);
        barNou.adaugareProdus(produsNou);
        barNou.printeazaBon();
    }
}
