package classes.factory;

import classes.IBicicleta;
import classes.MTB;

public class FabricaMTB implements FabricaBiciclete {
    @Override
    public IBicicleta creareObiect(String numeModel, double pret) {
        return new MTB(numeModel, pret);
    }
}
