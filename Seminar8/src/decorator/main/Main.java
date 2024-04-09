package decorator.main;

import decorator.decorator.AplicatieMobila;
import decorator.decorator.DecoratorAbstract;
import decorator.decorator.Website;
import decorator.spital.Diagnostic;
import decorator.spital.DiagnosticAbstract;

public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract diagnostic = new Diagnostic("Raceala", "Febra, dureri musculare, dureri in gat", false);
        diagnostic.printeazaDiagnostic();

        System.out.println();

        DecoratorAbstract aplicatieMobila = new AplicatieMobila(diagnostic);
        aplicatieMobila.afisareOnline();
        aplicatieMobila.printeazaDiagnostic();

        System.out.println();

        DecoratorAbstract website = new Website(diagnostic);
        website.afisareOnline();
        website.printeazaDiagnostic();
    }
}
