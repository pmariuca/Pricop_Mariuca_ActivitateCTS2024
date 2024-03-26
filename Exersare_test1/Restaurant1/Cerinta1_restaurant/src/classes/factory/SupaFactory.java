package classes.factory;

import classes.Supa;

import java.util.List;

public interface SupaFactory {
    public Supa creareSupa(int nrPortii, List<String> ingrediente);
}
