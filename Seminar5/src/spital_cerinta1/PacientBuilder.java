package spital_cerinta1;

public class PacientBuilder implements Builder {
    private Pacient pacient;
    @Override
    public Pacient build() {
        return this.pacient;
    }

    public PacientBuilder() {
        this.pacient = new Pacient(false, false, false, false);
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilder setMicDejun(boolean micDejun) {
        this.pacient.setMicDejun(micDejun);
        return this;
    }

    public PacientBuilder setPapuciCamera(boolean papuciCamera) {
        this.pacient.setPapuciCamera(papuciCamera);
        return this;
    }

    public PacientBuilder setHalatInterior(boolean halatInterior) {
        this.pacient.setHalatInterior(halatInterior);
        return this;
    }
}
