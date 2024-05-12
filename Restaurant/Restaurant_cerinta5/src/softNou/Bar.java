package softNou;

import java.util.ArrayList;
import java.util.List;

public class Bar {
    private List<Bautura> listaBauturi;

    public Bar() {
        this.listaBauturi = new ArrayList<>();
    }

    public List<Bautura> getListaBauturi() {
        return listaBauturi;
    }

    public void adaugaBautura(Bautura bautura) {
        this.listaBauturi.add(bautura);
    }

    public void printareNotaDePlata() {
        double total = 0;
        System.out.println("Lista de bauturi:");
        for (Bautura bautura : listaBauturi) {
            System.out.println("Bautura: " + bautura.getDenumire() + " " + bautura.getPret());
            total += bautura.getPret();
        }
        System.out.println("Totalul bauturilor este: "+total);
    }
}
