package classes;

public class FacturaBuilder implements Builder {
    private Factura factura;

    public FacturaBuilder() {
        this.factura = new Factura(0, false, false, 0.0);
    }

    public FacturaBuilder setNumarPungi(int numarPungi) {
        this.factura.setNumarPungi(numarPungi);
        return this;
    }

    public FacturaBuilder setPlataCuCard(boolean plataCuCard) {
        this.factura.setPlataCuCard(plataCuCard);
        return this;
    }

    public FacturaBuilder setCardFidelitate(boolean cardFidelitate) {
        this.factura.setCardFidelitate(cardFidelitate);
        return this;
    }

    public FacturaBuilder setCotaTVA(double cotaTVA) {
        this.factura.setCotaTVA(cotaTVA);
        return this;
    }

    @Override
    public Factura build() {
        return this.factura;
    }
}
