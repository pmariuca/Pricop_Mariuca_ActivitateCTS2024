package main;

import clase.Autobuz;
import clase.Fabrica;
import clase.Flyweight;
import clase.Linie;

public class Main {
    public static void main(String[] args) {
        Flyweight linie32 = new Linie(32, "ASE", "Arena Nationala");
        linie32.inregistreazaAutobuz(new Autobuz("V324", 1985, 30));

        Fabrica fabrica = new Fabrica();
        fabrica.getLinie(32, "ASE", "Arena Nationala").inregistreazaAutobuz(new Autobuz("V324", 1985, 30));
        fabrica.getLinie(32, "ASE", "Arena Nationala").inregistreazaAutobuz(new Autobuz("N934", 1999, 15));
    }
}
