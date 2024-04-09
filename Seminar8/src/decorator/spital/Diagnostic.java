package decorator.spital;

public class Diagnostic implements DiagnosticAbstract {
    private String denumire;
    private String simptome;
    private boolean necesitaSpitalizare;

    public Diagnostic(String denumire, String simptome, boolean necesitaSpitalizare) {
        this.denumire = denumire;
        this.simptome = simptome;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getSimptome() {
        return simptome;
    }

    public boolean isNecesitaSpitalizare() {
        return necesitaSpitalizare;
    }

    @Override
    public void printeazaDiagnostic() {
        System.out.println("Diagnosticul " + this.denumire + " are simptomele " + this.simptome + (necesitaSpitalizare ? " si necesita spitalizare." : " si nu necesita spitalizare."));
    }
}
