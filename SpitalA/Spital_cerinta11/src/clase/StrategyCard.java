package clase;

public class StrategyCard implements Strategy {
    @Override
    public void efectueazaPlata() {
        System.out.println("Ati efectuat plata cu cardul.");
    }
}
