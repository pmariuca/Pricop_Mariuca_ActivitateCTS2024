package main;

import clase.Bancomat;

public class Main {
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat(1000);
        bancomat.introduCard();
        bancomat.retragereBani(500);

        bancomat.introduPin();
        bancomat.retragereBani(1200);
        bancomat.retragereBani(1000);
        bancomat.retragereBani(100);

        bancomat.retragereCard();
    }
}
