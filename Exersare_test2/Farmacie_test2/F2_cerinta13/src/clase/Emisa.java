package clase;

public class Emisa implements Stare {
    protected Emisa() {
    }
    @Override
    public void setStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
