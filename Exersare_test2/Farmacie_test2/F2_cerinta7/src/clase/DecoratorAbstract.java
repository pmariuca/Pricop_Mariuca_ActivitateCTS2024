package clase;

import java.util.List;

public abstract class DecoratorAbstract implements BonAbstract {
    private BonAbstract bonAbstract;

    public DecoratorAbstract(BonAbstract bonAbstract) {
        this.bonAbstract = bonAbstract;
    }

    public abstract void afiseazaMesaj();

    @Override
    public void printeaza() {
        bonAbstract.printeaza();
        System.out.println("Bonul a fost printat.");
    }

    @Override
    public List<Produs> getProduse() {
        return bonAbstract.getProduse();
    }

    @Override
    public int getId() {
        return bonAbstract.getId();
    }
}
