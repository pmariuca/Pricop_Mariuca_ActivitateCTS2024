package classes.factory;

import classes.Brancardier;
import classes.PersonalSpital;

public class FabricaBrancardier implements FabricaPersonalSpital {
    @Override
    public PersonalSpital creeazaObiect(String nume, int varsta) {
        return new Brancardier(nume, varsta);
    }
}
