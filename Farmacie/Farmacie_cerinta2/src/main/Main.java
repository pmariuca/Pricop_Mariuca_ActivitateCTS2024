package main;

import factoryMethod.Medicament;
import factoryMethod.factory.*;

public class Main {
    public static void main(String[] args) {
        FabricaMedicament fabricaRaceala = new FabricaRaceala();
        FabricaMedicament fabricaBody = new FabricaBody();
        FabricaMedicament fabricaDurere = new FabricaDurere();
        FabricaMedicament fabricaVitamine = new FabricaVitamine();

        Medicament raceala = fabricaRaceala.createMedicament("Theraflu", 38.99);
        Medicament body = fabricaBody.createMedicament("NoSPA", 37.99);
        Medicament durere = fabricaDurere.createMedicament("Paracetamol", 5.96);
        Medicament vitamine = fabricaVitamine.createMedicament("Mini Martieni", 28.99);

        raceala.afisareDetalii();
        body.afisareDetalii();
        durere.afisareDetalii();
        vitamine.afisareDetalii();
    }
}
