package strategy.main;

import strategy.classes.Portar;
import strategy.classes.VerificatorPeluza;
import strategy.classes.VerificatorTribuna;
import strategy.classes.VerificatorVIP;

public class Main {
    public static void main(String[] args) {
        // sportiv cerinta 11 - se face verificarea cand suporterul ajunge la poarta
        // participanti - Portar, Verificare, VerificatorVIP, VerificatorTribuna, VerificatorPeluza
        String suporter1 = "Gigel VIP";
        String suporter2 = "Gigel Tribuna";
        String suporter3 = "Gigel Peluza";

        Portar portar = new Portar();
        portar.verificaSuporter(suporter1);

        portar.setStrategie(new VerificatorVIP());
        portar.verificaSuporter(suporter1);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter(suporter2);

        portar.setStrategie(new VerificatorPeluza());
        portar.verificaSuporter(suporter3);
    }
}
