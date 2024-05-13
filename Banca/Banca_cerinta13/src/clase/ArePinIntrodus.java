package clase;

public class ArePinIntrodus implements Stare {
    protected ArePinIntrodus() {
    }

    @Override
    public void setStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
