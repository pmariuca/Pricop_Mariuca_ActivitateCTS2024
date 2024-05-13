package clase;

public class Solicitata implements Stare {
    protected Solicitata() {
    }

    @Override
    public void setStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
