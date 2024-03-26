package classes.factory;

import classes.Supa;
import classes.SupaLegume;

import java.util.List;

public class SupaLegumeFactory implements SupaFactory {
    @Override
    public Supa creareSupa(int nrPortii, List<String> ingrediente) {
        return new SupaLegume(nrPortii, ingrediente);
    }
}
