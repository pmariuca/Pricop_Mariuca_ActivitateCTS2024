package main;

import clase.Angajat;
import clase.Verificare;
import clase.VerificareJuridica;

public class Main {
    public static void main(String[] args) {
        String client1 = "Popescu Ion Fizica";
        String client2 = "Pop Dan Juridica";
        Angajat angajat = new Angajat();
        angajat.verifica(client1);

        angajat.setVerificare(new VerificareJuridica());
        angajat.verifica(client2);
    }
}
