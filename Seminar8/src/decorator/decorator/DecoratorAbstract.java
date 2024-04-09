package decorator.decorator;

import decorator.spital.DiagnosticAbstract;

public abstract class DecoratorAbstract implements DiagnosticAbstract {
    private DiagnosticAbstract diagnosticAbstract;

    public DecoratorAbstract(DiagnosticAbstract diagnosticAbstract) {
        this.diagnosticAbstract = diagnosticAbstract;
    }

    public DiagnosticAbstract getDiagnosticAbstract() {
        return diagnosticAbstract;
    }

    @Override
    public String getDenumire() {
        return diagnosticAbstract.getDenumire();
    }

    @Override
    public String getSimptome() {
        return diagnosticAbstract.getSimptome();
    }

    @Override
    public boolean isNecesitaSpitalizare() {
        return diagnosticAbstract.isNecesitaSpitalizare();
    }

    public abstract void afisareOnline();

    @Override
    public void printeazaDiagnostic() {
        diagnosticAbstract.printeazaDiagnostic();
        System.out.println("Rezultatul este disponibil si pe platforma.");
    }
}
