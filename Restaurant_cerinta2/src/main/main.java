package main;

import builder_v2.Rezervare;

public class main {
    public static void main(String[] args) {
        Rezervare.RezervareBuilder builder = new Rezervare.RezervareBuilder();
        Rezervare rezervare1 = builder
                .setAsezareGeam(true)
                .setDecorareMasa(true)
                .setMuzicaAmbientalaPersonalizata(true)
                .build();
        System.out.println(rezervare1.toString());

        Rezervare rezervare2 = builder
                .setAsezareGeam(false)
                .setDecorareMasa(false)
                .setScauneErgonomice(true)
                .setMuzicaAmbientalaPersonalizata(false)
                .setGenMuzica(true)
                .build();
        System.out.println(rezervare2.toString());
    }
}
