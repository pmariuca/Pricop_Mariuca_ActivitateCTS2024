package main;

import factoryMethod.Serviciu;
import factoryMethod.factory.FabricaServiciu;
import factoryMethod.factory.FabricaServiciuFizica;
import factoryMethod.factory.FabricaServiciuJuridica;

public class Main {
    public static void prelucrareServicii(FabricaServiciu fabricaServiciu, String denumire, String data) {
        Serviciu serviciu = fabricaServiciu.creareServiciu(denumire, data);

        serviciu.afisareDetalii();
    }
    public static void main(String[] args) {
        prelucrareServicii(new FabricaServiciuJuridica(), "Imprumut", "18.03.2024");
        prelucrareServicii(new FabricaServiciuFizica(), "Consultanta", "18.03.2024");
    }
}
