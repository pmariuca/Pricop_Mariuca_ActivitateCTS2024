package clase;

public class Proxy implements Internare {
    private Internare internareSpital;
    private static boolean necesitaAsigurare = true;

    public Proxy(Internare internareSpital) {
        this.internareSpital = internareSpital;
    }

    @Override
    public void interneaza(Pacient pacient) {
        if(pacient.isAreAsigurare() == necesitaAsigurare) {
            internareSpital.interneaza(pacient);
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " trebuie sa aiba asigurare de sanatate pentru a se interna.");
        }
    }
}
