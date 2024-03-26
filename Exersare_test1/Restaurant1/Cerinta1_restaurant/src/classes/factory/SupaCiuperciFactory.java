package classes.factory;

import classes.Supa;
import classes.SupaCiuperci;

import java.util.List;

public class SupaCiuperciFactory implements SupaFactory {
    @Override
    public Supa creareSupa(int nrPortii, List<String> ingrediente) {
        return new SupaCiuperci(nrPortii, ingrediente);
    }
}
