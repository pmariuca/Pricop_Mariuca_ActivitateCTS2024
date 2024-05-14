package clase;

public class ProxyCalatori implements IAutobuz {
    private IAutobuz autobuz;

    public ProxyCalatori(IAutobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opreste(StatieAutobuz statieAutobuz) {
        if(statieAutobuz.isSuntCalatori()) {
            this.autobuz.opreste(statieAutobuz);
        } else {
            System.out.println("Nu sunt calatori in statia " + statieAutobuz.getNume());
        }
    }
}
