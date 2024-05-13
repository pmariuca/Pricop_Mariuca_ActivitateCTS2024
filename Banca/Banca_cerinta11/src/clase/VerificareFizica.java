package clase;

public class VerificareFizica implements Verificare {
    @Override
    public void verificaDocumente(String numeClient) {
        System.out.println("Se verifica buletinul si adeverinta de munca pentru " + numeClient);
    }
}
