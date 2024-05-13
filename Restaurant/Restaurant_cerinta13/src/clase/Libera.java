package clase;

public class Libera implements Stare {
    protected Libera() {
    }

    @Override
    public void setStare(Masa masa) {
        masa.setStare(this);
    }
}
