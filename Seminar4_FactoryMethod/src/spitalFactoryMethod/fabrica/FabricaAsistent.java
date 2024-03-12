package spitalFactoryMethod.fabrica;

import spitalFactoryMethod.Asistent;
import spitalFactoryMethod.PersonalSpital;

public class FabricaAsistent implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
