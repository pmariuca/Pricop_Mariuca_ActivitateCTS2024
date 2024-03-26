package classes.factory;

import classes.Supa;
import classes.SupaCiuperci;
import classes.SupaLegume;
import classes.SupaVita;

import java.util.List;

public class SupaFactory {
    public Supa creareObiect(TipSupa tipSupa, int nrPortii, List<String> ingrediente) throws Exception {
        switch (tipSupa) {
            case CIUPERCI -> {
                return new SupaCiuperci(nrPortii, ingrediente);
            }
            case LEGUME -> {
                return new SupaLegume(nrPortii, ingrediente);
            }
            case VITA -> {
                return new SupaVita(nrPortii, ingrediente);
            }
            default -> throw new Exception("Acest tip de supa nu exsta!");
        }
    }
}
