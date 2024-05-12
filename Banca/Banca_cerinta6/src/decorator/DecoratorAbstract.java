package decorator;

import banca.CardAbstract;

public abstract class DecoratorAbstract implements CardAbstract {
    private CardAbstract cardAbstract;

    public DecoratorAbstract(CardAbstract cardAbstract) {
        this.cardAbstract = cardAbstract;
    }

    public abstract void afiseazaMesaj(double suma);

    @Override
    public void plateste(double suma) {
        cardAbstract.plateste(suma);
    }

    @Override
    public String getNume() {
        return cardAbstract.getNume();
    }

    @Override
    public String getIBAN() {
        return cardAbstract.getIBAN();
    }
}
