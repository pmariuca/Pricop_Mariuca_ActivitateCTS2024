package main;

import clase.Farmacie;
import clase.Medicament;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie();

        Medicament paracetamol = new Medicament("Paracetamol", 10, 5.6);
        Medicament nurofen = new Medicament("Nurofen", 0, 38.3);
        farmacie.adaugaMedicament(paracetamol);
        farmacie.adaugaMedicament(nurofen);

        farmacie.achizitioneazaMedicament(paracetamol);
        farmacie.achizitioneazaMedicament(nurofen);
    }
}
