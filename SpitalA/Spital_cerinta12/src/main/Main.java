package main;

import observer.Observer;
import observer.Pacient;
import subiect.Spital;
import subiect.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect spital = new Spital("Bragadiru");
        Observer pacient1 = new Pacient("Popescu Ion");
        Observer pacient2 = new Pacient("Pop Dan");

        spital.adaugaObserver(pacient1);
        spital.adaugaObserver(pacient2);
        spital.notificaEpidemie();
        spital.notificaVirus();
    }
}
