package main;

import classes.Bicicleta;
import classes.IBicicleta;
import classes.factory.FabricaBiciclete;
import classes.factory.FabricaElectrica;
import classes.factory.FabricaMTB;
import classes.factory.FabricaTrekking;

public class Main {
    public static void prelucrareBiciclete(FabricaBiciclete fabricaBiciclete, String numeModel, double pret) {
        IBicicleta bicicleta = fabricaBiciclete.creareObiect(numeModel, pret);
        bicicleta.afiseazaDetalii();
    }

    public static void main(String[] args) {
        Bicicleta.BicicletaBuilder bicicletaBuilder = new Bicicleta.BicicletaBuilder();
        Bicicleta bicicleta = bicicletaBuilder
                .setNumeModel("X3")
                .setPret(300.0)
                .setDiametruRoti(180.8)
                .setTipFrana("normala")
                .setCascaProtectie(true)
                .setOchelari(false)
                .build();

        Bicicleta bicicleta1 = bicicletaBuilder
                .setNumeModel("X5")
                .setPret(600.2)
                .setDiametruRoti(190.3)
                .build();

        bicicleta.afiseazaDetalii();
        bicicleta1.afiseazaDetalii();

        prelucrareBiciclete(new FabricaMTB(), "X4", 1263.2);
        prelucrareBiciclete(new FabricaElectrica(), "X3", 3222.2);
        prelucrareBiciclete(new FabricaTrekking(), "2A", 236.2);
    }
}
