package softVechi;

import softNou.Bautura;

public class AdapterBauturaProdus extends Produs {
    // cream bautura ca fiind produs normal
    private Bautura bautura;
    public AdapterBauturaProdus(Bautura bautura) {
        super(bautura.getDenumire(), bautura.getPret());
        this.bautura = bautura;
    }
}
