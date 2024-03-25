package classes.factory;

import classes.IBicicleta;

public interface FabricaBiciclete {
    public IBicicleta creareObiect(String numeModel, double pret);
}
