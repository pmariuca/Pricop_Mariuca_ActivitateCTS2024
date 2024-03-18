package factoryMethod.factory;

import factoryMethod.Medicament;
import factoryMethod.Raceala;

public class FabricaRaceala implements FabricaMedicament {
    @Override
    public Medicament createMedicament(String denumire, double pret) {
        return new Raceala(denumire, pret);
    }
}
