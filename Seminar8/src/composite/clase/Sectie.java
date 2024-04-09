package composite.clase;

public class Sectie extends StructuraAbstracta {
    private int nrAngajati;
    private String sefSectie;
    public Sectie(String nume, String sefSectie, int nrAngajati) {
        super(nume);
        this.sefSectie = sefSectie;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaDescriere(String indentare) {
        System.out.println(indentare + "Sectia " + super.getNume() + " este condusa de " + this.sefSectie + " si are " + this.nrAngajati + " angajati.");
    }
}
