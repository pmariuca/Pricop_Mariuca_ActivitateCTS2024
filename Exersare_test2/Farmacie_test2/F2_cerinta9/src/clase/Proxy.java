package clase;

public class Proxy {
    private Vanzare vanzareMedicament;
    private final boolean necesitaReteta = true;

    public Proxy(Vanzare vanzareMedicament) {
        this.vanzareMedicament = vanzareMedicament;
    }

    public void achizitioneazaMedicament(boolean areReteta) {
        if(necesitaReteta) {
            if(areReteta) {
                vanzareMedicament.vinde();
            } else {
                System.out.println("Pentru a achizitiona medicamentul trebuie sa aveti reteta.");
            }
        } else {
            vanzareMedicament.vinde();
        }
    }
}
