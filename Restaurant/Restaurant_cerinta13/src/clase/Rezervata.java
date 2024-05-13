package clase;

public class Rezervata implements Stare {
    protected Rezervata() {
    }

    @Override
    public void setStare(Masa masa) {
        masa.setStare(this);
    }
}
