package main;

import classes.Fabrica;
import classes.Optiuni;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        Optiuni optiuni1 = new Optiuni(2, 3, "17:00");
        Optiuni optiuni2 = new Optiuni(6, 4, "20:00");
        fabrica.getRezervare("Popescu Ion", "0756859636", "popescu@gmail.com").rezerva(optiuni1);
        fabrica.getRezervare("Popescu Ion", "0756859636", "popescu@gmail.com").rezerva(optiuni2);
    }
}
