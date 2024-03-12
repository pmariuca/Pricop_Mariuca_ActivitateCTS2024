package spitalFactoryMethod.fabrica;

import spitalFactoryMethod.PersonalSpital;

public interface FabricaPersonal {
    public PersonalSpital createPersonal(String nume, int salariu);
}
