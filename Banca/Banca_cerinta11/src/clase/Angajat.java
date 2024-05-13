package clase;

public class Angajat {
    private Verificare verificare;

    public Angajat() {
        this.verificare = new VerificareFizica();
    }

    public Angajat(Verificare verificare) {
        this.verificare = verificare;
    }

    public void setVerificare(Verificare verificare) {
        this.verificare = verificare;
    }

    public void verifica(String numeClient) {
        verificare.verificaDocumente(numeClient);
    }
}
