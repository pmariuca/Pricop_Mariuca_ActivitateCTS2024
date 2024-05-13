package clase;

public abstract class Achizitie {
    public void achizitioneazaReteta(Reteta reteta) {
        primesteReteta(reteta);
        boolean esteStoc = verificaStoc(reteta);
        if(esteStoc) {
            aduMedicamente();
            incaseazaBani(reteta);
            scadeStoc(reteta);
            emiteBon(reteta);
        } else {
            refuzaAchizitie();
        }
    }
    public abstract void primesteReteta(Reteta reteta);
    public abstract boolean verificaStoc(Reteta reteta);
    public abstract void refuzaAchizitie();
    public abstract void aduMedicamente();
    public abstract void incaseazaBani(Reteta reteta);
    public abstract void scadeStoc(Reteta reteta);
    public abstract void emiteBon(Reteta reteta);
}
