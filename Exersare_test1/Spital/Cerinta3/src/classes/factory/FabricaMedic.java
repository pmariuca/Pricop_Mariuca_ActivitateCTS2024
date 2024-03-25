package classes.factory;

import classes.Medic;
import classes.PersonalSpital;

public class FabricaMedic implements FabricaPersonalSpital {
    @Override
    public PersonalSpital creeazaObiect(String nume, int varsta) {
        return new Medic(nume, varsta);
    }
}
