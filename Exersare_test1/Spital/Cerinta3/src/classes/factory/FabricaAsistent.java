package classes.factory;

import classes.Asistent;
import classes.PersonalSpital;

public class FabricaAsistent implements FabricaPersonalSpital {
    @Override
    public PersonalSpital creeazaObiect(String nume, int varsta) {
        return new Asistent(nume, varsta);
    }
}
