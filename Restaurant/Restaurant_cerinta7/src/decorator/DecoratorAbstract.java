package decorator;

import restaurant.NotaDePlataAbstract;

public abstract class DecoratorAbstract implements NotaDePlataAbstract {
    private NotaDePlataAbstract notaDePlataAbstract;

    public DecoratorAbstract(NotaDePlataAbstract notaDePlataAbstract) {
        this.notaDePlataAbstract = notaDePlataAbstract;
    }

    public abstract void afisareMesaj();

    @Override
    public String getChelner() {
        return this.notaDePlataAbstract.getChelner();
    }

    @Override
    public double getTotal() {
        return this.notaDePlataAbstract.getTotal();
    }

    @Override
    public void printeazaNota() {
        this.notaDePlataAbstract.printeazaNota();
    }
}
