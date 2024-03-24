package classes;

public class ContBancar implements AbstractContBancar {
    private String nume;
    private String CNP;
    private String numarCard;
    private String codCard;

    public ContBancar() {
        this.nume = "";
        this.CNP = "";
        this.numarCard = "";
        this.codCard = "";
    }

    public ContBancar(String nume, String CNP, String numarCard, String codCard) {
        this.nume = nume;
        this.CNP = CNP;
        this.numarCard = numarCard;
        this.codCard = codCard;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getNumarCard() {
        return numarCard;
    }

    public void setNumarCard(String numarCard) {
        this.numarCard = numarCard;
    }

    public String getCodCard() {
        return codCard;
    }

    public void setCodCard(String codCard) {
        this.codCard = codCard;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "nume='" + nume + '\'' +
                ", CNP='" + CNP + '\'' +
                ", numarCard='" + numarCard + '\'' +
                ", codCard='" + codCard + '\'' +
                '}';
    }

    @Override
    public AbstractContBancar clone() {
        ContBancar contBancar = new ContBancar();
        contBancar.setNume(this.nume);
        contBancar.setCNP(this.CNP);
        contBancar.setNumarCard(this.numarCard);
        contBancar.setCodCard(this.codCard);

        return contBancar;
    }
}
