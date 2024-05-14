package main;

import clase.CardBancar;
import clase.CardCalatorii;
import clase.Sms;
import clase.Validator;

public class Main {
    public static void main(String[] args) {
        int idBilet = 26458;
        Validator validator = new Validator(221);
        validator.valideazaCalatorie(idBilet);

        validator.setAlgoritm(new CardBancar());
        validator.valideazaCalatorie(idBilet);

        validator.setAlgoritm(new Sms());
        validator.valideazaCalatorie(idBilet);
    }
}
