package classes.factory;

import classes.Sportiv;

public interface FabricaSportiv {
    public Sportiv creareSportiv(String nume, int varsta, String echipa);
}
