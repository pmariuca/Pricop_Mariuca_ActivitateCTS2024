package spital_cerinta1;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halatInterior;

    public Pacient(boolean patRabatabil, boolean micDejun, boolean papuciCamera, boolean halatInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
    }

    protected void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    protected void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    protected void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    protected void setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuciCamera=" + papuciCamera +
                ", halatInterior=" + halatInterior +
                '}';
    }
}
