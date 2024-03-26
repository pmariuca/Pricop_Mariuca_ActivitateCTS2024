package main;

import classes.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare.RezervareBuilder builder = new Rezervare.RezervareBuilder();

        Rezervare rezervare1 = builder
                .setAsezareLaGeam(true)
                .setDecorareaMesei(true)
                .setMuzicaAmbientalaPersonalizata(true)
                .setGenMuzica("Jazz")
                .build();

        Rezervare rezervare2 = builder
                .setAsezareLaGeam(false)
                .setScauneErgonomice(true)
                .setMuzicaAmbientalaPersonalizata(false)
                .setGenMuzica("")
                .build();

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}
