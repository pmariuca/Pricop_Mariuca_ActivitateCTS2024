package simpleFactory.fabrica;

import simpleFactory.Credit;
import simpleFactory.Ipotecare;
import simpleFactory.NevoiPersonale;

public class FabricaCredit {
    public Credit creareCredit(TipCredit tipCredit, double valoare, double dobanda) throws Exception {
        switch (tipCredit) {
            case NEVOI_PERSONALE -> {
                return new NevoiPersonale(valoare, dobanda);
            }
            case IPOTECARE -> {
                return new Ipotecare(valoare, dobanda);
            }
            default -> {
                throw new Exception("Acest tip de credit nu exista!");
            }
        }
    }
}
