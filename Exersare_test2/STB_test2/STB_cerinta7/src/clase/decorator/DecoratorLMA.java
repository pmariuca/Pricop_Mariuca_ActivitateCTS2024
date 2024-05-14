package clase.decorator;

import clase.obiect.BiletAbstract;

public class DecoratorLMA extends DecoratorAbstract {
    public DecoratorLMA(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printeazaMesaj() {
        System.out.println("Cu ocazia sarbatorilor va uram La Multi Ani!");
        System.out.println("Bilet: id = " + super.getId() + ", data expirare = " + super.getDataExpirare());
    }
}
