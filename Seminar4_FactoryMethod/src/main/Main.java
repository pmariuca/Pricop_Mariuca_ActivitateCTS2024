package main;

import spitalFactoryMethod.PersonalSpital;
import spitalFactoryMethod.fabrica.FabricaAsistent;
import spitalFactoryMethod.fabrica.FabricaInfirmier;
import spitalFactoryMethod.fabrica.FabricaMedic;
import spitalFactoryMethod.fabrica.FabricaPersonal;

public class Main {
    public static void prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume, int salariu){
        PersonalSpital personalSpital = fabricaPersonal.createPersonal(nume, salariu);

        personalSpital.afisareDetalii();
    }

    public static void main(String[] args) {
        FabricaPersonal fabricaMedic = new FabricaMedic();
        FabricaPersonal fabricaAsistent = new FabricaAsistent();

        PersonalSpital medic = fabricaMedic.createPersonal("Popescu Ana", 10000);
        PersonalSpital asistemt = fabricaAsistent.createPersonal("Enescu Maria", 6000);

        medic.afisareDetalii();
        asistemt.afisareDetalii();

        prelucrarePersonal(new FabricaMedic(), "Butnaru Alex", 3000);
        prelucrarePersonal(new FabricaInfirmier(), "Petrache Stela", 6000);
    }
}