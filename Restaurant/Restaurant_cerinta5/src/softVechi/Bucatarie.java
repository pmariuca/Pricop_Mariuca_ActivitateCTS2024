package softVechi;

import java.util.ArrayList;
import java.util.List;

public class Bucatarie implements SoftBucatarie {
    private List<Produs> listaProduse;

    public Bucatarie() {
        this.listaProduse = new ArrayList<>();
    }

    public List<Produs> getListaProduse() {
        return listaProduse;
    }

    @Override
    public void printeazaBon() {
        System.out.println("Lista de produse este:");
        double total = 0;
        for (Produs produs : listaProduse) {
            System.out.println("Produsul: " + produs.getDenumire() + " " + produs.getPret());
            total = total + produs.getPret();
        }
        System.out.println("Totalul bonului este: " + total);
    }

    @Override
    public void adaugareProdus(Produs produs) {
        this.listaProduse.add(produs);
    }
}
