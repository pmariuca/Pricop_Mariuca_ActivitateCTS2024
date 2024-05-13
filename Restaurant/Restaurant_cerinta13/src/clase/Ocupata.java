package clase;

public class Ocupata implements Stare {
    protected Ocupata() {}
    @Override
    public void setStare(Masa masa) {
        masa.setStare(this);
    }
}
