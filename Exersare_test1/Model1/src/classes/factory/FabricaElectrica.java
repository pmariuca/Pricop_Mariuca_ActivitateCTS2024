package classes.factory;

import classes.Electrica;
import classes.IBicicleta;

public class FabricaElectrica implements FabricaBiciclete {
    @Override
    public IBicicleta creareObiect(String numeModel, double pret) {
        return new Electrica(numeModel, pret);
    }
}
