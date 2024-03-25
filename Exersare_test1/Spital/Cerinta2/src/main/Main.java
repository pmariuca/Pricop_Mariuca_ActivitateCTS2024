package main;

import classes.PersonalSpital;
import classes.factory.FabricaPersonalSpital;
import classes.factory.TipPersonalSpital;

public class Main {
    public static void main(String[] args) {
        FabricaPersonalSpital fabricaPersonalSpital = new FabricaPersonalSpital();

        try {
            PersonalSpital asistent = fabricaPersonalSpital.creeazaObiect(TipPersonalSpital.ASISTENT, "Pop Andrei", 36);
            PersonalSpital brancardier = fabricaPersonalSpital.creeazaObiect(TipPersonalSpital.BRANCARDIER, "Sava Silviu", 28);
            PersonalSpital medic = fabricaPersonalSpital.creeazaObiect(TipPersonalSpital.MEDIC, "Diaconu Vlad", 35);

            asistent.descriere();
            brancardier.descriere();
            medic.descriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
