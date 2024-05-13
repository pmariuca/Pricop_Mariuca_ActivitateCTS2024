package clase;

public class DecoratorLMA extends DecoratorAbstract {
    public DecoratorLMA(BonAbstract bonAbstract) {
        super(bonAbstract);
    }

    @Override
    public void afiseazaMesaj() {
        super.printeaza();
        System.out.println("Restaurantul va ureaza la multi ani!");
    }
}
