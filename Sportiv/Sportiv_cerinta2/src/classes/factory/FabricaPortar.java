package classes.factory;

import classes.Portar;
import classes.Sportiv;

public class FabricaPortar implements FabricaSportiv {
    @Override
    public Sportiv creareSportiv(String nume, int varsta, String echipa) {
        return new Portar(nume, varsta, echipa);
    }
}
