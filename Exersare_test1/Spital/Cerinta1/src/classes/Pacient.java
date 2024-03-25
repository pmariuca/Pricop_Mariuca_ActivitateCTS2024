package classes;

public class Pacient {
    private String numePacient;
    private Integer varsta;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public Pacient(String numePacient, Integer varsta, boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera, boolean halatPentruInterior) {
        this.numePacient = numePacient;
        this.varsta = varsta;
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPentruInterior = halatPentruInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "numePacient='" + numePacient + '\'' +
                ", varsta=" + varsta +
                ", patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciDeCamera=" + papuciDeCamera +
                ", halatPentruInterior=" + halatPentruInterior +
                '}';
    }

    public static class PacientBuilder implements Builder {
        private String numePacient;
        private Integer varsta;
        private boolean patRabatabil;
        private boolean micDejunInclus;
        private boolean papuciDeCamera;
        private boolean halatPentruInterior;

        public PacientBuilder() {
            this.numePacient = "";
            this.varsta = 0;
            this.patRabatabil = false;
            this.micDejunInclus = false;
            this.papuciDeCamera = false;
            this.halatPentruInterior = false;
        }

        public PacientBuilder setNumePacient(String numePacient) {
            this.numePacient = numePacient;
            return this;
        }

        public PacientBuilder setVarsta(Integer varsta) {
            this.varsta = varsta;
            return this;
        }

        public PacientBuilder setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }

        public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
            this.micDejunInclus = micDejunInclus;
            return this;
        }

        public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
            this.papuciDeCamera = papuciDeCamera;
            return this;
        }

        public PacientBuilder setHalatPentruInterior(boolean halatPentruInterior) {
            this.halatPentruInterior = halatPentruInterior;
            return this;
        }

        @Override
        public Pacient build() {
            return new Pacient(this.numePacient, this.varsta, this.patRabatabil, this.micDejunInclus, this.papuciDeCamera, this.halatPentruInterior);
        }
    }
}
