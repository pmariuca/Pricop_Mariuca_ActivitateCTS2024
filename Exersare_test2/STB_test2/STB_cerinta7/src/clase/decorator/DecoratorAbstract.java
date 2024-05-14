package clase.decorator;

import clase.obiect.BiletAbstract;

public abstract class DecoratorAbstract implements BiletAbstract {
    private BiletAbstract bilet;

    public DecoratorAbstract(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    public abstract void printeazaMesaj();

    @Override
    public void printeazaBilet() {
        System.out.println("Biletul urmeaza sa fie printat.");
        bilet.printeazaBilet();
    }

    @Override
    public int getId() {
        return this.bilet.getId();
    }

    @Override
    public String getDataExpirare() {
        return this.bilet.getDataExpirare();
    }
}
