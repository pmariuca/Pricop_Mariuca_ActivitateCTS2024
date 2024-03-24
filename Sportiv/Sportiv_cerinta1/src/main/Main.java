package main;

import classes.Sportiv;
import classes.factory.SportivFactory;
import classes.factory.TipSportiv;

public class Main {
    public static void main(String[] args) {
        SportivFactory sportivFactory = new SportivFactory();

        try {
            Sportiv atacant = sportivFactory.creareSportiv(TipSportiv.ATACANT, "Popescu Ion", 22, "FCSB");
            Sportiv fundas = sportivFactory.creareSportiv(TipSportiv.FUNDAS, "Pop Andrei", 24, "FCSB");
            Sportiv portar = sportivFactory.creareSportiv(TipSportiv.PORTAR, "Lungu Mihai", 23, "FCSB");

            atacant.descrie();
            fundas.descrie();
            portar.descrie();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
