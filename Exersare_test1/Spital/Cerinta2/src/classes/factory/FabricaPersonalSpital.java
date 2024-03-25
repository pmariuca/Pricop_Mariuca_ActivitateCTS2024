package classes.factory;

import classes.Asistent;
import classes.Brancardier;
import classes.Medic;
import classes.PersonalSpital;

public class FabricaPersonalSpital {
    public PersonalSpital creeazaObiect(TipPersonalSpital tipPersonalSpital, String nume, int varsta) throws Exception {
        switch (tipPersonalSpital) {
            case ASISTENT -> {
                return new Asistent(nume, varsta);
            }
            case BRANCARDIER -> {
                return new Brancardier(nume, varsta);
            }
            case MEDIC -> {
                return new Medic(nume, varsta);
            }
            default -> throw new Exception("Acest tip de personal nu exista!");
        }
    }
}
