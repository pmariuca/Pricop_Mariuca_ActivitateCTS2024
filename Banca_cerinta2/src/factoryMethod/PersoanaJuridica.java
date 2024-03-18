package factoryMethod;

public class PersoanaJuridica extends Serviciu {
    public PersoanaJuridica(String denumire, String data) {
        super(denumire, data);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Serviciu pentru persoana juridica cu denumirea " + this.getDenumire() + " la data de " + this.getData());
    }
}
