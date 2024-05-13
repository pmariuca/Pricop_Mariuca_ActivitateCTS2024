package main;

import clase.Farmacie;
import clase.Medicament;
import clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Medicament med1 = new Medicament("Paracetamol", 5.6, 2);
        Medicament med2 = new Medicament("Nurofen", 35.6, 5);
        Medicament med3 = new Medicament("Cerave", 18.8, 0);

        Reteta reteta1 = new Reteta(125);
        reteta1.adaugaMedicament(med1);
        reteta1.adaugaMedicament(med2);

        Farmacie farmacie = new Farmacie();
        farmacie.achizitioneazaReteta(reteta1);

        System.out.println();
        reteta1.adaugaMedicament(med3);
        farmacie.achizitioneazaReteta(reteta1);
    }
}
