package factoryMethod.factory;

import factoryMethod.PersoanaFizica;
import factoryMethod.Serviciu;

public class FabricaServiciuFizica implements FabricaServiciu {
    @Override
    public Serviciu creareServiciu(String denumire, String data) {
        return new PersoanaFizica(denumire, data);
    }
}
