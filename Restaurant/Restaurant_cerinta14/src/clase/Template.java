package clase;

public abstract class Template {
    public final void ocupareMasa() {
        curataMasa();
        asazaServetele();
        asazaTacamuri();
        invitaPersoane();
    }
    public abstract void curataMasa();
    public abstract void asazaServetele();
    public abstract void asazaTacamuri();
    public abstract void invitaPersoane();
}
