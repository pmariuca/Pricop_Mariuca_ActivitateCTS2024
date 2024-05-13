package clase;

public abstract class Template {
    public final void achizitioneazaMedicament(Medicament medicament) {
        primesteReteta();
        int stoc = verificaStoc(medicament);
        if(stoc <= 0) {
            refuzaAchizitionare();
        } else {
            aduMedicament();
            incaseazaBani(medicament);
            emiteChitanta(medicament);
        }
    }

    public abstract void primesteReteta();
    public abstract int verificaStoc(Medicament medicament);
    public abstract void aduMedicament();
    public abstract void refuzaAchizitionare();
    public abstract void incaseazaBani(Medicament medicament);
    public abstract void emiteChitanta(Medicament medicament);
}
