package proxy.clase;

public class Proxy implements Vanzare {
    private Vanzare vanzareBilete;
    private static int varstaMinima = 14;

    public Proxy(Vanzare vanzareBilete) {
        this.vanzareBilete = vanzareBilete;
    }

    public static void setVarstaMinima(int varstaMinima) {
        Proxy.varstaMinima = varstaMinima;
    }

    @Override
    public void vinde(Persoana persoana) {
        if(persoana.getVarsta() >= varstaMinima) {
            vanzareBilete.vinde(persoana);
        } else {
            System.out.println("Persoana " + persoana.getNume() +
                    " are varsta de " + persoana.getVarsta() +
                    " si nu poate achizitiona biletul.");
        }
    }
}
