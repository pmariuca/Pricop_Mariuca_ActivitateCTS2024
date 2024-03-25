package classes;

public class Doctor {
    private int idDoctor;
    private String nume;
    private String specializare;

    public Doctor(int idDoctor, String nume, String specializare) {
        this.idDoctor = idDoctor;
        this.nume = nume;
        this.specializare = specializare;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }
}
