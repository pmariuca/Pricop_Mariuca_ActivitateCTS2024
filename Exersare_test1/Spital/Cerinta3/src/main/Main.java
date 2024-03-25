package main;

import classes.PersonalSpital;
import classes.factory.FabricaAsistent;
import classes.factory.FabricaBrancardier;
import classes.factory.FabricaMedic;
import classes.factory.FabricaPersonalSpital;

public class Main {
    public static void prelucrarePersonal(FabricaPersonalSpital fabricaPersonalSpital, String nume, int varsta) {
        PersonalSpital personalSpital = fabricaPersonalSpital.creeazaObiect(nume, varsta);

        personalSpital.descriere();
    }

    public static void main(String[] args) {
        prelucrarePersonal(new FabricaAsistent(), "Pop Ion", 32);
        prelucrarePersonal(new FabricaBrancardier(), "Butacu Diana", 24);
        prelucrarePersonal(new FabricaMedic(), "Din Andrei", 42);
    }
}
