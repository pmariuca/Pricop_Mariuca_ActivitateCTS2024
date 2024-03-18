package factoryMethod.factory;

import factoryMethod.Medicament;

public interface FabricaMedicament {
    public Medicament createMedicament(String denumire, double pret);
}
