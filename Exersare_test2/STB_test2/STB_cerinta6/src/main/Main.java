package main;

import clase.Autobuz;
import clase.Grup;
import clase.StructuraAbstracta;
import clase.Unitate;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta structuraAbstracta = new Unitate("Unitate STB");

        StructuraAbstracta grup10 = new Grup(10);
        StructuraAbstracta grup30 = new Grup(30);
        StructuraAbstracta grup50 = new Grup(50);

        StructuraAbstracta autobuz10 = new Autobuz("VW", "S514", 10);
        grup10.adaugaStructura(autobuz10);

        StructuraAbstracta autobuz30 = new Autobuz("VW", "S52e14", 30);
        grup30.adaugaStructura(autobuz30);

        StructuraAbstracta autobuz50 = new Autobuz("VW", "S51df4", 50);
        grup50.adaugaStructura(autobuz50);

        structuraAbstracta.adaugaStructura(grup10);
        structuraAbstracta.adaugaStructura(grup30);
        structuraAbstracta.adaugaStructura(grup50);
        structuraAbstracta.afiseazaIerarhie("   ");
    }
}
