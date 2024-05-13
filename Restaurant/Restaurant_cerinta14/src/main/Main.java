package main;

import clase.Grup;
import clase.Masa;

public class Main {
    public static void main(String[] args) {
        Grup grup = new Grup();
        grup.adaugaPersoana("Popescu Ion");
        grup.adaugaPersoana("Popescu Laura");
        grup.adaugaPersoana("Pop Dan");

        Masa masa1 = new Masa(1, grup);
        masa1.ocupareMasa();
    }
}
