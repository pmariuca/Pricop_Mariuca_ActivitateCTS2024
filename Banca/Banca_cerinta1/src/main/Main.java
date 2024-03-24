package main;

import simpleFactory.Credit;
import simpleFactory.fabrica.FabricaCredit;
import simpleFactory.fabrica.TipCredit;

public class Main {
    public static void main(String[] args) {
        FabricaCredit fabricaCredit = new FabricaCredit();

        try {
            Credit creditNevoiPersonale = fabricaCredit.creareCredit(TipCredit.NEVOI_PERSONALE,250000, 26.99);
            Credit creditIpotecare = fabricaCredit.creareCredit(TipCredit.IPOTECARE, 368000, 28.33);

            creditNevoiPersonale.afisareDetalii();
            creditIpotecare.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
