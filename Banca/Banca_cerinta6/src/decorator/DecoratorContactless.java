package decorator;

import banca.CardAbstract;

public class DecoratorContactless extends DecoratorAbstract {
    public DecoratorContactless(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    @Override
    public void afiseazaMesaj(double suma) {
        System.out.println(super.getNume() + " ai efectuat o plata in valoare de " + suma + " lei.");
        System.out.println("Plata a fost efectuata contactless cu IBAN-ul " + super.getIBAN());

    }
}
