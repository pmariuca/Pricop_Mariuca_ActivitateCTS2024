package clase;

public class Achizitionata implements Stare {
    protected Achizitionata() {
    }

    @Override
    public void setStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
