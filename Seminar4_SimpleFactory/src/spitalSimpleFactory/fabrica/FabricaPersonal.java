package spitalSimpleFactory.fabrica;

import spitalSimpleFactory.*;

public class FabricaPersonal {
    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume, double salariu) throws Exception {
        switch (tipPersonal) {
            case BRANCARDIER -> {
                return new Brancardier(nume, salariu);
            }
            case MEDIC -> {
                return new Medic(nume, salariu);
            }
            case ASISTENT -> {
                return new Asistent(nume, salariu);
            }
            case INFIRMIER -> {
                return new Infirmier(nume, salariu);
            }
            default -> {
                throw new Exception("Tipul nu exista!");
            }
        }
    }
}
