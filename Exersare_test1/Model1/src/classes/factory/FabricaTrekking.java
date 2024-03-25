package classes.factory;

import classes.IBicicleta;
import classes.Trekking;

public class FabricaTrekking implements FabricaBiciclete {
    @Override
    public IBicicleta creareObiect(String numeModel, double pret) {
        return new Trekking(numeModel, pret);
    }
}
