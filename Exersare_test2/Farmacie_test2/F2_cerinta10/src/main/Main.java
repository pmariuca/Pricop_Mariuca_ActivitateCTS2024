package main;

import clase.Client;
import clase.Fabrica;
import clase.Flyweight;
import clase.InformatiiReteta;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        fabrica.getClient("Popescu Ion", 125).achizitioneazaMedicament(new InformatiiReteta(12, 1, 36.5));
    }
}
