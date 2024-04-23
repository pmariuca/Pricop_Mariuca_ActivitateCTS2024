package strategy.classes;

public class VerificatorTribuna implements Verificator {
    @Override
    public void verifica(String numeSuporter) {
        System.out.println("Este verificat biletul si bagajele lui " + numeSuporter);
    }
}
