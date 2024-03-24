package classes.factory;

import classes.Fundas;
import classes.Sportiv;

public class FabricaFundas implements FabricaSportiv {
    @Override
    public Sportiv creareSportiv(String nume, int varsta, String echipa) {
        return new Fundas(nume, varsta, echipa);
    }
}
