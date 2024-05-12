package decorator;

import restaurant.NotaDePlataAbstract;

public class DecoratorMesaj extends DecoratorAbstract {
    public DecoratorMesaj(NotaDePlataAbstract notaDePlataAbstract) {
        super(notaDePlataAbstract);
    }

    @Override
    public void afisareMesaj() {
        System.out.println("Nota de plata: ");
        System.out.println("Chelner: " + super.getChelner());
        System.out.println("Total de plata: " + super.getTotal());
        System.out.println("La multi ani!");
    }
}
