package clase;

import java.util.ArrayList;
import java.util.List;

public class Farmacie extends Template {
    private List<Medicament> medicamente;

    public Farmacie() {
        this.medicamente = new ArrayList<>();
    }

    public void adaugaMedicament(Medicament medicament) {
        this.medicamente.add(medicament);
    }

    @Override
    public void primesteReteta() {
        System.out.println("Se verifica reteta...");
    }

    @Override
    public int verificaStoc(Medicament medicament) {
        return medicament.getStoc();
    }

    @Override
    public void aduMedicament() {
        System.out.println("Medicamentul este adus din depozit...");
    }

    @Override
    public void refuzaAchizitionare() {
        System.out.println("Ne pare rau, dar medicamentul nu este in stoc momentan.");
    }

    @Override
    public void incaseazaBani(Medicament medicament) {
        System.out.println("S-a incasat suma de " + medicament.getPret() + " lei.");
    }

    @Override
    public void emiteChitanta(Medicament medicament) {
        medicament.setStoc(medicament.getStoc()-1);
        System.out.println("Chitanta: ");
        System.out.println(medicament.getDenumire() + ".............................." + medicament.getPret());
    }
}
