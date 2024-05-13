package clase;

public class VerificareJuridica implements Verificare {
    @Override
    public void verificaDocumente(String numeClient) {
        System.out.println("Se verifica actele de infiintare a firmei si dovada inregistrarii la Registrul Comertului pentru " + numeClient);
    }
}
