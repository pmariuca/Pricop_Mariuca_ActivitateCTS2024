package clase;

public class Sms implements Algoritm {
    @Override
    public void valideaza(int id) {
        System.out.println(" a fost validat prin sms biletul cu id-ul "+ id);
    }
}
