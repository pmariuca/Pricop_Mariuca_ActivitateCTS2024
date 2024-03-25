package main;

import classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient.PacientBuilder pacientBuilder = new Pacient.PacientBuilder();
        Pacient pacient1 = pacientBuilder
                .setNumePacient("Popescu Ion")
                .setVarsta(28)
                .setMicDejunInclus(true)
                .setPapuciDeCamera(true)
                .build();

        Pacient pacient2 = pacientBuilder
                .setNumePacient("Gheorghe Adina")
                .setVarsta(61)
                .setPatRabatabil(true)
                .setPapuciDeCamera(false)
                .build();

        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());
    }
}
