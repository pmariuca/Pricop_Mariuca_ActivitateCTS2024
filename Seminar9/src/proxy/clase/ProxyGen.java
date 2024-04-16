package proxy.clase;

public class ProxyGen implements Vanzare {
    private Vanzare vanzareBilete;
    private String genAcceptat;

    public ProxyGen(Vanzare vanzareBilete, String genAcceptat) {
        this.vanzareBilete = vanzareBilete;
        this.genAcceptat = genAcceptat;
    }

    public void setGenAcceptat(String genAcceptat) {
        this.genAcceptat = genAcceptat;
    }

    @Override
    public void vinde(Persoana persoana) {
        if(persoana.getGen().equals(this.genAcceptat)) {
            vanzareBilete.vinde(persoana);
        } else {
            System.out.println("La meciul acesta pot intra doar persoanele de gen " + this.genAcceptat);
        }
    }
}
