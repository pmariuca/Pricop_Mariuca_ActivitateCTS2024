package classes.factory;

import classes.Atacant;
import classes.Sportiv;

public class FabricaAtacant implements FabricaSportiv {
    @Override
    public Sportiv creareSportiv(String nume, int varsta, String echipa) {
        return new Atacant(nume, varsta, echipa);
    }
}
