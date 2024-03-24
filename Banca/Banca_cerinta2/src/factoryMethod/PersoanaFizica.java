package factoryMethod;

public class PersoanaFizica extends Serviciu {
    public PersoanaFizica(String denumire, String data) {
        super(denumire, data);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Serviciu pentru persoana fizica cu denumirea " + this.getDenumire() + " la data de " + this.getData());
    }
}
