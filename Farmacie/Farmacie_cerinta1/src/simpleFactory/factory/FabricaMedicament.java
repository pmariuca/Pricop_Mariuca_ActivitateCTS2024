package simpleFactory.factory;

import simpleFactory.*;

public class FabricaMedicament {
    public Medicament creareMedicament(TipMedicament tipMedicament, String denumire, Double pret) throws Exception {
        switch(tipMedicament) {
            case RACEALA -> {
                return new Raceala(denumire, pret);
            }
            case DURERE -> {
                return new Durere(denumire, pret);
            }
            case BODY -> {
                return new Body(denumire, pret);
            }
            case VITAMINE -> {
                return new Vitamine(denumire, pret);
            }
            default -> {
                throw new Exception("Tipul de medicament nu exista!");
            }
        }
    }
}
