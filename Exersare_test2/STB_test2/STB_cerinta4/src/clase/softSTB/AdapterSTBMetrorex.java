package clase.softSTB;

import clase.softMetrorex.BiletMetrorex;
import clase.softMetrorex.Metrorex;

public class AdapterSTBMetrorex extends Metrorex implements Calatorie {
    public AdapterSTBMetrorex(String numeStatie) {
        super(numeStatie);
    }

    @Override
    public void valideazaBilet(BiletSTB bilet) {
        BiletMetrorex biletAdapter = new BiletMetrorex(bilet.getId());
        super.scaneazaBilet(biletAdapter);
    }
}
