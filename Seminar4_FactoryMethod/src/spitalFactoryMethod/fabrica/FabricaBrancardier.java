package spitalFactoryMethod.fabrica;

import spitalFactoryMethod.Brancardier;
import spitalFactoryMethod.PersonalSpital;

public class FabricaBrancardier implements FabricaPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Brancardier(nume, salariu);
    }
}
