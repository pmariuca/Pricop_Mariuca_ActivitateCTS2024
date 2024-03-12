package simpleFactory.factory;

import simpleFactory.*;

import java.util.List;

public class FabricaSupa {
    public Supa createSupa(TipSupa tipSupa, int nrPortii, List<String> ingrediente) throws Exception {
        switch (tipSupa) {
            case LEGUME -> {
                return new SupaLegume(nrPortii, ingrediente);
            }
            case CIUPERCI -> {
                return new SupaCiuperci(nrPortii, ingrediente);
            }
            case VITA -> {
                return new SupaVita(nrPortii, ingrediente);
            }
            case GALUSTE -> {
                return new SupaGaluste(nrPortii, ingrediente);
            }
            default -> {
                throw new Exception("Tipul de supa nu exista!");
            }
        }
    }
}
