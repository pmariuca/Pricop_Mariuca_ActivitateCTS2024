package factoryMethod.factory;

import factoryMethod.Serviciu;

public interface FabricaServiciu {
    public Serviciu creareServiciu(String denumire, String data);
}
