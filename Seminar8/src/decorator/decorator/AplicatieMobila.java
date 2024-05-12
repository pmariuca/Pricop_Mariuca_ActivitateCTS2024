package decorator.decorator;

import decorator.decorator.DecoratorAbstract;
import decorator.spital.DiagnosticAbstract;

public class AplicatieMobila extends DecoratorAbstract {
    public AplicatieMobila(DiagnosticAbstract diagnosticAbstract) {
        super(diagnosticAbstract);
    }

    @Override
    public void afisareOnline() {
        System.out.println("In cadrul aplicatiei mobile ati primit urmatorul diagnostic: ");
        System.out.println("Diagnosticul " + super.getDenumire() + " are simptomele " + super.getSimptome() + (super.isNecesitaSpitalizare() ? " si necesitati spitalizare." : " si nu necesitati spitalizare."));
    }
}
