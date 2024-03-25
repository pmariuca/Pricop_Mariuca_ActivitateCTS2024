package main;

import classes.Rezervare;
import classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare = builder
                .setMancareInclusa(true)
                .setBauturaRacoritoareInclusa(true)
                .setMuzicaAmbientalaPersonalizata(true)
                .setGenMuzica("Pop")
                .build();

        Rezervare rezervare1 = builder
                .setMancareInclusa(false)
                .setScaunErgonomic(true)
                .setBauturaRacoritoareInclusa(false)
                .setGenMuzica("Rock")
                .build();

        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());
    }
}
