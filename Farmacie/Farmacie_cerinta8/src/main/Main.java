package main;

import clase.Medicament;
import clase.Sectiune;
import clase.StructuraArborescenta;

public class Main {
    public static void main(String[] args) {
        StructuraArborescenta farmacie = new Sectiune("Farmacie");

        StructuraArborescenta raceala = new Sectiune("Raceala");
        StructuraArborescenta racealaAdulti = new Sectiune("Adulti");
        StructuraArborescenta adultiPar = new Medicament("Parasinus Penta");
        StructuraArborescenta racealaCopii = new Sectiune("Copii");
        StructuraArborescenta copiiMed = new Medicament("Septimar Baby");

        racealaAdulti.adaugaStructura(adultiPar);
        racealaCopii.adaugaStructura(copiiMed);
        raceala.adaugaStructura(racealaAdulti);
        raceala.adaugaStructura(racealaCopii);
        farmacie.adaugaStructura(raceala);

        StructuraArborescenta durere = new Sectiune("Durere");
        StructuraArborescenta nurofen = new Medicament("Nurofen");
        StructuraArborescenta parac = new Medicament("Paracetamol");

        durere.adaugaStructura(nurofen);
        durere.adaugaStructura(parac);
        farmacie.adaugaStructura(durere);

        farmacie.afiseazaStructura("    ");
    }
}
