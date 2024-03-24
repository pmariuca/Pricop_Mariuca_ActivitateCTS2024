package main;

import simpleFactory.Medicament;
import simpleFactory.factory.FabricaMedicament;
import simpleFactory.factory.TipMedicament;

public class Main {
    public static void main(String[] args) {
        FabricaMedicament fabricaMedicament = new FabricaMedicament();

        try {
            Medicament raceala = fabricaMedicament.creareMedicament(TipMedicament.RACEALA, "Theraflu", 39.99);
            Medicament durere = fabricaMedicament.creareMedicament(TipMedicament.DURERE, "Paracetamol", 5.86);
            Medicament body = fabricaMedicament.creareMedicament(TipMedicament.BODY, "NoSPA", 38.96);

            raceala.afisareDetalii();
            durere.afisareDetalii();
            body.afisareDetalii();

            Medicament vitamine = fabricaMedicament.creareMedicament(TipMedicament.VITAMINE, "Mini martieni", 18.99);
            vitamine.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
