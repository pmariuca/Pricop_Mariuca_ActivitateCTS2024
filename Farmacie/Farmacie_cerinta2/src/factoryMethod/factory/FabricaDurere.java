package factoryMethod.factory;

import factoryMethod.Durere;
import factoryMethod.Medicament;

public class FabricaDurere implements FabricaMedicament {
    @Override
    public Medicament createMedicament(String denumire, double pret) {
        return new Durere(denumire, pret);
    }
}
