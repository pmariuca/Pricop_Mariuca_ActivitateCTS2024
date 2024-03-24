package main;

import classes.Sportiv;
import classes.factory.FabricaAtacant;
import classes.factory.FabricaFundas;
import classes.factory.FabricaPortar;
import classes.factory.FabricaSportiv;

public class Main {
    public static void prelucrareSportiv(FabricaSportiv fabricaSportiv, String nume, int varsta, String echipa) {
        Sportiv sportiv = fabricaSportiv.creareSportiv(nume, varsta, echipa);
        sportiv.descrie();
    }
    public static void main(String[] args) {
        prelucrareSportiv(new FabricaAtacant(), "Popescu Ion", 22, "FCSB");
        prelucrareSportiv(new FabricaFundas(), "Pop Andrei", 24, "FCSB");
        prelucrareSportiv(new FabricaPortar(), "Lungu Mihai", 23, "FCSB");
    }
}
