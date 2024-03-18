package factoryMethod.factory;

import factoryMethod.Body;
import factoryMethod.Medicament;

public class FabricaBody implements FabricaMedicament {
    @Override
    public Medicament createMedicament(String denumire, double pret) {
        return new Body(denumire, pret);
    }
}
