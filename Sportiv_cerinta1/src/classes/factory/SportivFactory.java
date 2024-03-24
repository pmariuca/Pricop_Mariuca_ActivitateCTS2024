package classes.factory;

import classes.Atacant;
import classes.Fundas;
import classes.Portar;
import classes.Sportiv;

public class SportivFactory {
    public Sportiv creareSportiv(TipSportiv tipSportiv, String nume, int varsta, String echipa) throws Exception {
        switch (tipSportiv) {
            case ATACANT -> {
                return new Atacant(nume, varsta, echipa);
            }
            case FUNDAS -> {
                return new Fundas(nume, varsta, echipa);
            }
            case PORTAR -> {
                return new Portar(nume, varsta, echipa);
            }
            default -> {
                throw new Exception("Tipul introdus nu exista!");
            }
        }
    }
}
