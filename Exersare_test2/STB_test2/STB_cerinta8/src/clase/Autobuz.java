package clase;

public class Autobuz implements IAutobuz {
    private int id;

    public Autobuz(int id) {
        this.id = id;
    }

    @Override
    public void opreste(StatieAutobuz statieAutobuz) {
        System.out.println("Autobuzul " + this.id + " a oprit in statia " + statieAutobuz.getNume());
    }
}
