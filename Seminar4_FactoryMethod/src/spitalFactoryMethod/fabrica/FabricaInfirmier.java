package spitalFactoryMethod.fabrica;

import spitalFactoryMethod.Infirmier;
import spitalFactoryMethod.PersonalSpital;

public class FabricaInfirmier implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}
