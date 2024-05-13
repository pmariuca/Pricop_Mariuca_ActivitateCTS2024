package clase;

public class Bancomat {
    private int sold;
    private Stare stare;

    public Bancomat(int sold) {
        this.sold = sold;
        if(this.sold == 0) {
            this.stare = new NuAreBani();
        } else {
            this.stare = new NuAreCard();
        }
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void introduCard() {
        if(stare instanceof NuAreCard) {
            this.stare = new AreCard();
            System.out.println("S-a introdus cardul.");
        } else {
            System.out.println("Cardul nu a putut fi introdus");
        }
    }

    public void introduPin() {
        if(stare instanceof AreCard) {
            this.stare = new ArePinIntrodus();
            System.out.println("S-a introdus pinul.");
        } else {
            System.out.println("Nu exista un card pentru care sa se introduca pinul");
        }
    }

    public void retragereBani(int suma) {
        if(stare instanceof ArePinIntrodus) {
            if(suma <= this.sold) {
                System.out.println("A fost retrasa suma de " + suma + " lei.");
                this.sold = this.sold - suma;
            } else {
                System.out.println("Nu sunt suficienti bani.");
            }

            if(sold == 0) {
                this.stare = new NuAreBani();
            }
        } else {
            System.out.println("Pentru a retrage bani trebuie sa fie introdus pinul.");
        }
    }

    public void retragereCard() {
        if(stare instanceof AreCard || stare instanceof ArePinIntrodus) {
            this.stare = new NuAreCard();
            System.out.println("Cardul a fost retras");
        }
    }
}
