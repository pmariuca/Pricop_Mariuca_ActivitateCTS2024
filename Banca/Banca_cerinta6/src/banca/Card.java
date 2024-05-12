package banca;

public class Card implements CardAbstract {
    private String nume;
    private String IBAN;

    public Card(String nume, String IBAN) {
        this.nume = nume;
        this.IBAN = IBAN;
    }

    @Override
    public void plateste(double suma) {
        System.out.println(this.nume + " ai efectuat o plata in valoare de " + suma + " lei.");
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public String getIBAN() {
        return this.IBAN;
    }
}
