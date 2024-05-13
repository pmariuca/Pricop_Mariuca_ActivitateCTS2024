package clase;

import java.util.ArrayList;
import java.util.List;

public class BonCasa implements BonAbstract {
    private List<Produs> produse;
    private int id;

    public BonCasa(int id) {
        this.produse = new ArrayList<>();
        this.id = id;
    }

    public void adaugaProdus(Produs produs) {
        this.produse.add(produs);
    }

    @Override
    public void printeaza() {
        System.out.println("Bonul cu id-ul " + this.id + ":");
        double total = 0;
        for (Produs produs : produse) {
            total += produs.getPret();
            System.out.println("    " + produs.getDenumire() + "    " +  produs.getPret());
        }
        System.out.println("Total: " + total + " lei");
    }

    @Override
    public List<Produs> getProduse() {
        return this.produse;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
