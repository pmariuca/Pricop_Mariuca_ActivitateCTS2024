package classes.factory;

import classes.Autobuz;
import classes.MijlocTransport;
import classes.Tramvai;
import classes.Troleibuz;

public class FactoryMijlocTransport {
    public MijlocTransport creareObiect(TipMijlocTransport tipMijlocTransport, int an, String numeSofer, String numarInmatriculare) throws Exception {
        switch (tipMijlocTransport) {
            case AUTOBUZ -> {
                return new Autobuz(an, numeSofer, numarInmatriculare);
            }
            case TRAMVAI -> {
                return new Tramvai(an, numeSofer, numarInmatriculare);
            }
            case TROLEIBUZ -> {
                return new Troleibuz(an, numeSofer, numarInmatriculare);
            }
            default -> {
                throw new Exception("Acest tip nu exista!");
            }
        }
    }
}
