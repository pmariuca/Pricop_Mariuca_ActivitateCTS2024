package main;

import spitalSimpleFactory.PersonalSpital;
import spitalSimpleFactory.fabrica.FabricaPersonal;
import spitalSimpleFactory.fabrica.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FabricaPersonal fabrica = new FabricaPersonal();

        try {
            PersonalSpital medic = fabrica.createPersonal(TipPersonal.MEDIC, "Popescu Maria", 10000);
            PersonalSpital asistent = fabrica.createPersonal(TipPersonal.ASISTENT, "Ionescu Mihai", 50000);
            PersonalSpital brancardier = fabrica.createPersonal(TipPersonal.BRANCARDIER, "Popa Diana", 65000);
            PersonalSpital infirmier = fabrica.createPersonal(TipPersonal.INFIRMIER, "Pop Ion", 20000);

            medic.afisareDetalii();
            asistent.afisareDetalii();
            brancardier.afisareDetalii();
            infirmier.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

/* clasa fabrica cu metoda de creare tip */
/* clasa abstracta - personal spital */
/* brancardier, asistent, medic - extind clasa personal spital; atribute: nume, salariu (se vor afla in clasa personal spital) */
/* avem si enumul tipPersonal */