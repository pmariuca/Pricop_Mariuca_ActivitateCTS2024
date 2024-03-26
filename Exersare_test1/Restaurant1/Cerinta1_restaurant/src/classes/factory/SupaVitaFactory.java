package classes.factory;

import classes.Supa;
import classes.SupaVita;

import java.util.List;

public class SupaVitaFactory implements SupaFactory {
    @Override
    public Supa creareSupa(int nrPortii, List<String> ingrediente) {
        return new SupaVita(nrPortii, ingrediente);
    }
}
