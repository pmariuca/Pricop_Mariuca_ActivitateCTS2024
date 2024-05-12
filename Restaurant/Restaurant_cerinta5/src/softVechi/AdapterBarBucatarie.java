package softVechi;

import softNou.Bar;
import softNou.Bautura;

public class AdapterBarBucatarie extends Bar implements SoftBucatarie {
    @Override
    public void adaugareProdus(Produs produs){
        super.adaugaBautura(new Bautura(produs.getDenumire(), produs.getPret()));
    }

    @Override
    public void printeazaBon() {
        super.printareNotaDePlata();
    }
}
