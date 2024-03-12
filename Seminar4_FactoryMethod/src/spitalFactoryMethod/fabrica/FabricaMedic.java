package spitalFactoryMethod.fabrica;

import spitalFactoryMethod.Medic;
import spitalFactoryMethod.PersonalSpital;

public class FabricaMedic implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}