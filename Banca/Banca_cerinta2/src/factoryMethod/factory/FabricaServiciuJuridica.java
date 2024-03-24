package factoryMethod.factory;

import factoryMethod.PersoanaJuridica;
import factoryMethod.Serviciu;

public class FabricaServiciuJuridica implements FabricaServiciu {
    @Override
    public Serviciu creareServiciu(String denumire, String data) {
        return new PersoanaJuridica(denumire, data);
    }
}
