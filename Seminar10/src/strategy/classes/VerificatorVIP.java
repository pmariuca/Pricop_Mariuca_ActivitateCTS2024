package strategy.classes;

public class VerificatorVIP implements Verificator {
    @Override
    public void verifica(String numeSuporter) {
        System.out.println("Este verificat biletul lui " + numeSuporter);
    }
}
