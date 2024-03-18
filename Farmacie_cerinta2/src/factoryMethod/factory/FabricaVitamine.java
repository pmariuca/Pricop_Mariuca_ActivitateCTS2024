package factoryMethod.factory;

import factoryMethod.Medicament;
import factoryMethod.Vitamine;

public class FabricaVitamine implements FabricaMedicament {
    @Override
    public Medicament createMedicament(String denumire, double pret) {
        return new Vitamine(denumire, pret);
    }
}
