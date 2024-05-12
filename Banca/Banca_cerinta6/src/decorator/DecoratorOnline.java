package decorator;

import banca.CardAbstract;

public class DecoratorOnline extends DecoratorAbstract {
    public DecoratorOnline(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    @Override
    public void afiseazaMesaj(double suma) {
        System.out.println(super.getNume() + " ai efectuat o plata in valoare de " + suma + " lei.");
        System.out.println("Plata a fost efectuata online cu IBAN-ul " + super.getIBAN());
    }
}
