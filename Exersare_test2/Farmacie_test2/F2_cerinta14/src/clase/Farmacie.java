package clase;

public class Farmacie extends Achizitie {
    @Override
    public void primesteReteta(Reteta reteta) {
        System.out.println("Reteta este citita...");
    }

    @Override
    public boolean verificaStoc(Reteta reteta) {
        boolean esteStoc = true;
        for(Medicament med : reteta.getMedicamente()) {
            if(med.getStoc() <= 0) {
                esteStoc = false;
                break;
            }
        }

        return esteStoc;
    }

    @Override
    public void refuzaAchizitie() {
        System.out.println("Ne pare rau, dar nu exista stoc suficient pentru unul sau mai multe medicamente.");
    }

    @Override
    public void aduMedicamente() {
        System.out.println("Medicamentele sunt aduse din depozit...");
    }

    @Override
    public void incaseazaBani(Reteta reteta) {
        double total = 0;
        for(Medicament med : reteta.getMedicamente()) {
            total += med.getPret();
        }

        System.out.println("Se incaseaza suma de " + total + " lei...");
    }

    @Override
    public void scadeStoc(Reteta reteta) {
        for(Medicament med : reteta.getMedicamente()) {
            med.setStoc(med.getStoc()-1);
        }
    }

    @Override
    public void emiteBon(Reteta reteta) {
        System.out.println("Bonul pentru reteta achizitionata:");
        double total = 0;
        for(Medicament med : reteta.getMedicamente()) {
            total += med.getPret();
            System.out.println(med.getDenumire() + " " + med.getPret());
        }
        System.out.println("Total: " + total + " lei");
    }
}
