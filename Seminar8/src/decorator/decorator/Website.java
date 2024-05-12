package decorator.decorator;

import decorator.decorator.DecoratorAbstract;
import decorator.spital.DiagnosticAbstract;

public class Website extends DecoratorAbstract {
    public Website(DiagnosticAbstract diagnosticAbstract) {
        super(diagnosticAbstract);
    }

    @Override
    public void afisareOnline() {
        System.out.println("In cadrul website-ului ati primit urmatorul diagnostic: ");
        System.out.println("Diagnosticul " + super.getDenumire() + " are simptomele " + super.getSimptome() + (super.isNecesitaSpitalizare() ? " si necesita spitalizare." : " si nu necesita spitalizare."));
    }
}
